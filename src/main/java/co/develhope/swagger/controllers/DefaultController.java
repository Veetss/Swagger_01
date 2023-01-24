package co.develhope.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String welcomeMessage() {
        return "Welcome, please visit the url http://localhost:1234/swagger-ui/ for more information!";
    }

}