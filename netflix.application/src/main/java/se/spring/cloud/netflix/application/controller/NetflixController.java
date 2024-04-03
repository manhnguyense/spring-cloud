package se.spring.cloud.netflix.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class NetflixController {

    @GetMapping("/test")
    public String testController() {
        return "Hello";
    }
}
