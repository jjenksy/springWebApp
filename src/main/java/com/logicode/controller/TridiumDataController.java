package com.logicode.controller;

import com.logicode.model.TridiumData;
import com.logicode.model.User;
import com.logicode.repository.TridiumDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jjenkins on 10/24/2016.
 */
@RestController
@RequestMapping("/tridiumData")
public class TridiumDataController {

    //implementing the interface
    private TridiumDataRepo tridiumDataRepo;


    @Autowired
    public TridiumDataController(TridiumDataRepo tridiumDataRepo) {
        this.tridiumDataRepo = tridiumDataRepo;
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
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Iterable<TridiumData> tridium(Model model){
        //create a list and call the UserRepository findByID
        Iterable<TridiumData> tridiumList = tridiumDataRepo.findAll();
            return tridiumList;

    }
}
