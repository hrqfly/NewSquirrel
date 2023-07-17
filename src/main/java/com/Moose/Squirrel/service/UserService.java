package com.Moose.squirrel.service;

import com.Moose.squirrel.mapper.UserMapper;
import com.Moose.squirrel.pojo.Result;
import com.Moose.squirrel.pojo.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hrq
 * @date 07/17/2023
 *
 */

@Service
@AllArgsConstructor
public class UserService {
    private final UserMapper usermapper;

    public Result login(Integer id,String password){
        if (id==null||id<=0){
            return Result.error("no this user");
        }
        User user = usermapper.selectById(id);
        String password1 = user.getPassword();
        if (password1.equals(password)){
            return Result.ok();
        }
        return Result.error("password error");
    }
}
