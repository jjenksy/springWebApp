/**
 * Created by jjenkins on 10/25/2016.
 */

/**
 * This is my main Javascript file for the web front end controller
 */


    'use strict';

    //This controller module is represented as a simple JavaScript function
// that is given AngularJS’s $scope and $http components.
// It uses the $http component to consume the REST service at "/employee/John".
    //angular ajax request
(function mainApp() {
    angular.module('demo', [])
        .controller('Hello', function ($scope, $http) {
            $http.get('/employee/John').then(function (response) {
                console.log(response.data);
                $scope.greeting = response.data;
            });
        });
})();


