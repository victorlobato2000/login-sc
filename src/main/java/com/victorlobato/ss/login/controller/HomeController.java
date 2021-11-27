package com.victorlobato.ss.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Esta é a página inicial";
    }

    @GetMapping("/adm")
    public String adm(){
        return "Esta é a página do adm";
    }

}
