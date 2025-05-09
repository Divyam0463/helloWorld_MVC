package com.example.hello_world_mvc.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello_world_mvc.Model.Department;
import com.example.hello_world_mvc.Model.Employee;


@RestController
public class helloWorldController {
  private static Logger logger = LoggerFactory.getLogger(helloWorldController.class) ; 

  // //UC4
  // @RequestMapping("/")
  // public String getHellofromMain() {

  //   logger.info("Get request received at /");
  //   return "hello from bridgelabz" ; 
  // } 

  //UC6
  private final Employee emp ; 
  private final Department depart ;

  //Spring will automatically inject both the dependencies in the controller file (no need to use Autowired)
  public helloWorldController(Employee emp, Department depart) {
    this.emp = emp;
    this.depart = depart;
  } 

  @GetMapping("/uc6")
  public String getFields(){
    emp.setId(23);
    emp.setName("John");
    depart.setName("backend engineer");

    return "name: "+emp.getName()+", id: "+emp.getId()+", "+depart.getName() ; 
  }
}
