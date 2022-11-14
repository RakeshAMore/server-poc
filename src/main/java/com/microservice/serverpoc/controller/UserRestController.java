package com.microservice.serverpoc.controller;


import com.microservice.serverpoc.model.User;
import com.microservice.serverpoc.utils.RawData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/v1/users")
public class UserRestController {

    @RequestMapping(method = RequestMethod.GET)
    public List<User> users() {
        return RawData.getAllUsers();
    }
}
