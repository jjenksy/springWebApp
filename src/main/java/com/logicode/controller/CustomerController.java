package com.logicode.controller;

import com.logicode.model.Customer;
import com.logicode.model.User;
import com.logicode.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jjenkins on 11/1/2016.
 */

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    //get a reference to the customer repo
    CustomerRepo customerRepo;

    /**
     * Autowiring the dependency to be injected in the constructor
     * @param customerRepo
     */

    @Autowired
    public CustomerController(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    /**
     *This method is a get method the takes in a customerID and returns the JSON data of the customer
     * @param id the ID of the customer to return data for
     * @return the Itertable data
     */
    //the path varible must match the request mapping value when expecting arguments
    @RequestMapping(value = "/findCustomerByID/{id}",method = RequestMethod.GET,  produces = "application/json")
    public Iterable users(@PathVariable Long id){
        System.out.println(id);
        //create a list and call the UserRepository findByuserName method to populate it
        Iterable<Customer> customerList = customerRepo.findByid(id);
        return customerList;
    }

    /**
     * This method findsAll the customers in the dataBase
     * @return the list of customers and data
     */
    //the path varible must match the request mapping value when expecting arguments
    @RequestMapping(value = "/findAll",method = RequestMethod.GET,  produces = "application/json")
    public Iterable usersFindAll(){
        //create a list and call the UserRepository findByuserName method to populate it
        Iterable<Customer> customerList = customerRepo.findAll();

        return customerList;
    }


    /**
     * Handles HTTP POST requests for /{customer}, binding the
     * data in the body of the request to a Customer object. This method sets the customer
     * object’s data using save() method. Finally, it returns by specifying a redirect
     * to /{cusotomer} (which will be handled by the other controller method).
     * @param customer the customer object reference
     * @return the view
     */
    //convert the JSON object into a java object
    @PostMapping(path ="/addCustomer", consumes = "application/json")
    public Customer addToCustomerList(@RequestBody Customer customer){

        System.out.println(customer);
        customerRepo.save(customer);

        return customer;
    }
}
