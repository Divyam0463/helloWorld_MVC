package com.example.hello_world_mvc.Model;

import org.springframework.stereotype.Component;

@Component
public class Department {
  private String name ;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  } 
}
