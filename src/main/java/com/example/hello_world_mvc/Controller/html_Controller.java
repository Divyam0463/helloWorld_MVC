package com.example.hello_world_mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class html_Controller {
  
  @GetMapping("/hello/view")
  public String getView(Model model) {
    model.addAttribute("result" , "hello from bridgelabz") ; 
    return "result" ; 
  }
  
}
