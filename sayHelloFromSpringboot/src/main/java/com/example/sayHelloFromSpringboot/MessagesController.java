package com.example.sayHelloFromSpringboot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class MessagesController {

    @GetMapping("/messages")
    String getSomething(){
        return "Hello world!";
    }

    @PostMapping("/messages")
    String postSomething(){
        return "Hello world!";
    }

    @PutMapping("/messages")
    String putSomething(){
        return "Hello world!";
    }

    @DeleteMapping("/messages")
    String deleteSomething(){
        return "Hello world!";
    }
}
