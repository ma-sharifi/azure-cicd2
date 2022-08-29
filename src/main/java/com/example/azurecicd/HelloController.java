package com.example.azurecicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mahdi Sharifi
 * @since 8/29/22
 */
@RestController
public class HelloController {
    @GetMapping()
    public String sayHello(){
        return "Hello World!";
    }
}
