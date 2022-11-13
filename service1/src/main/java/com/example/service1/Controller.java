package com.example.service1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/service1")
public class Controller {
    @GetMapping("/")
    public String home() {
        return Service1Application.S.vadim.toString();
    }

    @PostMapping("/")
    public String home(@RequestParam String s) {
        System.out.println(s);
        Service1Application.S.vadim.add(s);
        return Service1Application.S.vadim.toString();
    }
}

