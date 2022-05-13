package com.greeting.greetingapp.controller;

import com.greeting.greetingapp.entity.User;
import com.greeting.greetingapp.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    ServiceLayer serviceLayer;

    @GetMapping("/happy")
    public String sayHello(){
      return serviceLayer.sayHello();
    }

    @RequestMapping(value = {"/hi"}, method = RequestMethod.GET)
    public String sayHelloDifferently() {
        return "Hello Everyone";
    }

    @RequestMapping(value = {"/qu"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello " + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam (@PathVariable String name){
        return "Hello " + name + " Welcome";
    }

    @PostMapping("/post")
    public String sayHello (User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName () + "!!!";
    }

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName")String lastName){
        return "Hello "+ firstName + " " + lastName + " !!!!";
    }

}
