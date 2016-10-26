/**
 * Created by jjenkins on 10/25/2016.
 */

/**
 * This is my main Javascript file for the web front end controller
 */
    //This controller module is represented as a simple JavaScript function
// Main angular routing app
(function() {
    'use strict';
    var app = angular.module("crudPage",["ngRoute"]);

    //config for app runs this when app is initially created
    app.config(function($routeProvider){

        //describe the route when user navigates to /main
        $routeProvider.when('/main',{
            templateUrl:"main.html",
            controller: "MainCtlr" //determines the controller for the templateURL view
        })//@otherwise if you dont know the url
            .otherwise({redirectTo:"/main"})
    })

})();


