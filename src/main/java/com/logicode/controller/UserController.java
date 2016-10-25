package com.logicode.controller;

import com.logicode.model.User;
import com.logicode.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jjenkins on 10/21/2016.
 * @UserController  is annotated with @Controller in order to be picked up by
 *component-scanning and automatically be registered as a bean in the Spring application
 *context. It’s also annotated with @RequestMapping to map all of its handler methods
 *to a base URL path of “/”.
 */

@RestController
@RequestMapping("/userList")//specify this controller to be the root of the domain
public class UserController {

    //create a UserRepository object
    private UserRepository userRepository;

    /**
     * contructer
     * @param userRepository
     */
    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * @user sGet the current list of users from the repo using the userName
     * Handles HTTP GET requests for /{user} by retrieving a
     * User list from the repository (which was injected into the controller’s constructor)
     * for the user specified in the path. It puts the list of User into the model
     * under the key “users” and returns “userList” as the logical name of the view
     * to render the model.
     * @param model the view
     * @return
     */

    //the path varible must match the request mapping value when expecting arguments
    @RequestMapping(value = "/{name}",method = RequestMethod.GET,  produces = "application/json")
    public Iterable users(@PathVariable String name, Model model){
        System.out.println(name);
        //create a list and call the UserRepository findByuserName method to populate it
        Iterable<User> userList = userRepository.findByfistName(name);

        return userList;
    }

    /**
     * @user Method to findAll my users in the database
     * @param model the view
     * @return
     */

    //the path varible must match the request mapping value when expecting arguments
    @RequestMapping(value = "/findAll",method = RequestMethod.GET,  produces = "application/json")
    public Iterable usersFindAll(Model model){
        //create a list and call the UserRepository findByuserName method to populate it
        Iterable<User> userList = userRepository.findAll();

        return userList;
    }


    /**
     * Handles HTTP POST requests for /{user}, binding the
     * data in the body of the request to a User object. This method sets the User
     * object’s userName property to the User’s name, and then saves the modified
     * User via the repository’s save() method. Finally, it returns by specifying a redirect
     * to /{user} (which will be handled by the other controller method).
     * @param user the user object reference
     * @return the view
     */
    @RequestMapping(method = RequestMethod.POST)
    public User addToUserList(User user){

        //add the user to the repo
        userRepository.save(user);


        return user;
    }
}
