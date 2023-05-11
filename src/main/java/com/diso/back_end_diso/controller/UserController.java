package com.diso.back_end_diso.controller;

import com.diso.back_end_diso.exception.UserDontExistsException;
import com.diso.back_end_diso.interfaces.IUser;
import com.diso.back_end_diso.model.User;
import com.diso.back_end_diso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController{

    @Autowired
    UserService userService;



    @GetMapping("/user")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        Optional<User> userOptional = userService.findById(id);
        if (userOptional.isEmpty()) throw new UserDontExistsException("This user doesnt exists!");

        return userOptional.get();
    }

    @PostMapping("/user")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable Long id) {
        Optional<User> userOptional = userService.findById(id);
        if (userOptional.isEmpty()) throw new UserDontExistsException("This user doesnt exists!");

        userService.delete(id);
        return "User ID: " + id + " has been deleted!";
    }
}
