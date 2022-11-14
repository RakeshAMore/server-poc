package com.microservice.serverpoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/v1/fake")
public class FakeController



{


    public String someUnformattedMethod()      {
        int aaaa;
        return "sdjfklsdjfkljasdlfjsdklajfsadkljfkladsfjklsa";
    }

    public String someFakeMethod()      {
        List<String> list = new ArrayList<>();


        list.add("Raks");



                return list.toString();
    }
}
