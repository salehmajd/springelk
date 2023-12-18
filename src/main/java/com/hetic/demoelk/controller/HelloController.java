package com.hetic.demoelk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index (@RequestParam(name="guest", required = false, defaultValue = "Guest") String guest) {
        return "Salut " + guest + ", bienvenue au Spring-boot";
    }
}
