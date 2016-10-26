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
     * @param userDetails custom service that makes the http calls
     * @param $anchorScroll allows for scrolling to the tagged dom id
     * @param $location allows to set an identifier in the URL bar
     * @constructor
     */
    var MainCtlr = function($scope, userDetails, $log , $anchorScroll, $location){
        $scope.username = "angular";
        $scope.message = "Angular Viewer";

        //search function emplementation

        $scope.search = function(username){
            $log.info("Searching for " + username);
                //custom service to get a parse the http response
                userDetails.getUser(username).then(function(data)
            {
                $scope.user = data;
                //set the hash(url fragment identifier)
                $location.hash('userDetails');
                //scroll to the hashed ID appending to the URL
                $anchorScroll('userDetails');
            })

        };
        //searchALL function todo fix this implemention
        $scope.findAll = function(){

        };
    };
    //declare the app controller and assign it a function
    //this binds this to the html page example = ng-controller="MainCtlr"
    app.controller("MainCtlr",MainCtlr);
}());