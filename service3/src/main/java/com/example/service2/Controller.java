package com.example.service3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service3")
public class Controller {
    @GetMapping("/")
    public String home() {
        return "Denys Sorokin Service";
    }
}
