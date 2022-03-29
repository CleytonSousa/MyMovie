package com.creitin.movies.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @RequestMapping("/teste", method = {RequestMethod.GET})
    public String testeGet(){
        return"WORKING!!!!!";
    }
}
