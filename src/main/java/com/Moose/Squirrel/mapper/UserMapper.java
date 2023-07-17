package com.Moose.squirrel.mapper;

import com.Moose.squirrel.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hrq
 * @date 07/17/2023
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
