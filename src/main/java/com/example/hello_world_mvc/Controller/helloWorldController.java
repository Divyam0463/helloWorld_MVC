package com.example.hello_world_mvc.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloWorldController {
  private static Logger logger = LoggerFactory.getLogger(helloWorldController.class) ; 

  //UC4
  @RequestMapping("/")
  public String getHellofromMain() {
    
    logger.info("Get request received at /");
    return "hello from bridgelabz" ; 
  }  

}
