package org.tic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("connexion")
public class PublicRestApiController {


    @GetMapping("login")
    public String login(){
        return "API LOGIN";
    }

    @GetMapping("logout")
    public String logout(){
        return "API LOGOUT";
    }



}
