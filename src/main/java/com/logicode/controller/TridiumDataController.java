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
 * Using @RestController so the view can be decoupled and updata through ajax requests
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
     * Get the current data from specified Database
     * Handles HTTP GET requests for Database by retrieving a
     * list from the repository (which was injected into the controller’s constructor)
     * @param model the view
     * @return
     */

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Iterable<TridiumData> tridium(Model model){
        //create a list and call the UserRepository findByID
        Iterable<TridiumData> tridiumList = tridiumDataRepo.findAll();
            return tridiumList;

    }
}
