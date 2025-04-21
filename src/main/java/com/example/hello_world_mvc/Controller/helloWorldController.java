package com.example.hello_world_mvc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class helloWorldController {

  //UC3
  @RequestMapping("/")
  public String getHellofromMain() {
    return "hello from bridgelabz" ; 
  }  

  //UC1
  @GetMapping("/hello")
  public String getHello() {
    return "hello world" ;
  }
  
}
