package com.Moose.squirrel.controller;

import com.Moose.squirrel.pojo.Result;
import com.Moose.squirrel.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hrq
 * @date 07/17/2023
 */

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/login")
    public Result login(Integer id, String password){
        return userService.login(id, password);
    }
}
