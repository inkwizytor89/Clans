package com.prototype.server;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/hallo")
    public String index() {
        return "Hallo visitor!";
    }

}