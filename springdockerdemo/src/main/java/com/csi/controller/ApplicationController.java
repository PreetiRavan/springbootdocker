package com.csi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @RequestMapping("/home")
    public String sayHome()
    {
        return "welcome to csi";
    }

    @RequestMapping("/Address")
    public String sayAddress()
    {
        return "Inspiria Mall | Pune | Nigdi";
    }

    @RequestMapping("/Application")
    public String sayApplication()
    {
        return "Application Developer | Qr Code Developer";
    }


}
