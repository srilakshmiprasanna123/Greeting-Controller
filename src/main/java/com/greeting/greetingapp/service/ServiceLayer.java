package com.greeting.greetingapp.service;

import com.greeting.greetingapp.entity.User;
import com.greeting.greetingapp.repository.GreetingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class ServiceLayer {
        @Autowired
        GreetingInterface greetingInterface;
        public String sayHello() {
            return "Hello World!!";
        }
        public String sayPostHello(User user) {
            User newUser = new User(user);
            return "Hello "+ newUser;
        }

        public User sayHello(User user){
            User newuser = new User(user);
            greetingInterface.save(newuser);
            return newuser;
        }
    }

