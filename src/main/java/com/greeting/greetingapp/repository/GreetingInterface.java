package com.greeting.greetingapp.repository;

import com.greeting.greetingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingInterface extends JpaRepository<User, Integer>{

}
