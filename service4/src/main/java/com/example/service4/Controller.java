package com.example.service4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service4")
public class Controller {
    @GetMapping("/")
    public String hello() {
        return "Hello from Docker from Stas Logvynskyi";
    }
}
