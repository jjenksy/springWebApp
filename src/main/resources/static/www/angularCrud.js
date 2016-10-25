/**
 * Created by jjenkins on 10/25/2016.
 */
/**
 * This module show angularjs used for http and dom manipulation
 */

(function (){
    "use strict";

    //get the module that is defined in the html page example: ng-app="crudPage"
    var app = angular.module("crudPage",[]);
    /**
     *THis is a controller in angular js
     * @param $scope the dom
     * @param $http get, post, put and delete methods
     * @constructor
     */
    var MainCtlr = function($scope, $http){
        $scope.username = "angular";
        $scope.message = "Angular Viewer";

        //search function emplementation
        $scope.search = function(username){
            console.log(username);
            //http method returns a promise
            $http.get("/userList/"+username)
                .then(function(response){
                    //returns everything in the database
                    console.log(response.data);
                    $scope.user = response.data;
                }).catch(function(e){
                //catch any exception thrown
                console.log(e);
            });
        };
        //searchALL function emplementation
        $scope.findAll = function(){

            //http method returns a promise
            $http.get("/userList/findAll")
                .then(function(response){
                    //returns everything in the database
                    console.log(response.data);
                    $scope.user = response.data;
                }).catch(function(e){
                //catch any exception thrown
                console.log(e);
            });
        };
    };
    //declare the app controller and assign it a function
    //this binds this to the html page example = ng-controller="MainCtlr"
    app.controller("MainCtlr",MainCtlr);

}());