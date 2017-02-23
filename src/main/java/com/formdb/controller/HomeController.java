package com.formdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Phani on 2/22/17.
 */

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
