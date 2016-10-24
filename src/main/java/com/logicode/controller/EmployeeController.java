package com.logicode.controller;

import com.logicode.model.Employee;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jjenkins on 10/21/2016.
 * This controller uses restful services creating a JSON object to allow fo passing of data to the client
 *
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    Employee employee = new Employee();

    /**
     * Restful Get method that produces a JSON to be consumed
     * @param name
     * @return the json the can then be consumed for the rest service
     *
     * @example http://localhost:8080/greeting/john
     *
     */
    //@GetMapping("/") todo test getMapping
    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
    public Employee getEmployeeInJSON(@PathVariable String name) {

        employee.setName(name);
        employee.setEmail(name+"@logicode.com");
        employee.setBio("A super great full stack developer!!");

        return employee;

    }
}