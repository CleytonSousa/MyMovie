package com.creitin.movies.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class TesteController {

    @RequestMapping(name="/teste",  method = {RequestMethod.GET})
    public String testeGet(){
        return"WORKING!!!!!";
    }
}
