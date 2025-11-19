package com.gymschool.controller;
import com.gymschool.model.User;
import com.gymschool.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.findAll();
    };

    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        userService.delete(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.save(user);
    }


}
