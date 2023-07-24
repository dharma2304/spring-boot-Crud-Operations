package com.dharmendra.Springboot.tutorial.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*

@RestController: It is a class level annotation which indicates that this class is request handler where we can define the endpoints in the class.
@RequestMapping: Its a method level annotation which maps the request sent to the method in the controller class
@GetMapping: It indicates that we are mapping http GET method request to the method in the Controller class which is similar to @RequestMapping() annotation

 */



@RestController
public class BasicController {

//    @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String welcomeMessage(){
        return "Hello Welcome to Spring Boot World";
    }


}
