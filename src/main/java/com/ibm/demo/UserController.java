package com.ibm.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
@GetMapping("/hello")


     String hello()
     {
	return "hello";
     }
}
