package com.example.sping_portfolio.controllers.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class LoginCTRL {
    @GetMapping("/login")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String login() {
        return "login"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/personTest")
    public String personTest() {
            return "personTest";
        }


    @GetMapping("/loginTest")
    public String loginTest() {
        return "loginTest";
    }
}


