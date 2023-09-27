package com.mkyong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    String hello() {
        int a = 5;
        int b = 5;
        int c = a+b;
    	return ("Sum = "+c);
        
    }

}