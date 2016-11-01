/**
 * Created by jjenkins on 11/1/2016.
 */
(function () {
    'use strict';
    var app = angular.module("crudPage");

    var ServiceTickerCtrl = function ($location,$scope, httpCustomerData) {

        $scope.ticketName = "Service Ticket";
        $scope.message = "Using Angular.j Controllers and Directives";

        /**
         * Gets the current customer info. as soon as the page is visited
         */
        (function getCustomer(){
            httpCustomerData.getCustomerData("/api/customer/findAll").then(function(data)
            {
                $scope.customers = data;
                console.log(data);
            });
        }());
        //the click button calls a function to navigate to a new route
        $scope.go = function (path) {

            $location.path( path );
        };
        /**
         * This is called when the value of the select box changes
         * @param item
         */
        $scope.changedValue = function() {

            httpCustomerData.getCustomerDataByID("/api/customer/findCustomerByID",$scope.selectedCustomer)
                .then(function(data){
                    console.log(data[0].address);
                    //after the data is retrieved from the server resolve the view
                    $scope.address = data[0].address;
                    $scope.city = data[0].city;
                    $scope.zip = data[0].zip;
                    $scope.country = data[0].country;
                })
        }

    };














    //tell angular about my controller
    app.controller("ServiceTickerCtrl",ServiceTickerCtrl);
}());