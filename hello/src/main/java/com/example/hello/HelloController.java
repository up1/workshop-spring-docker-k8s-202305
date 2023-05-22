package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello/{name}")
    public HelloResponse sayHi(@PathVariable String name) {
        return new HelloResponse(name);
    }

}

