package com.mytest.mapper;

import com.mytest.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2020/12/19
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where uid=#{uid}")
    User selUser(int uid);

    @Select("select * from user")
    List<User> selAll();

    @Options(useGeneratedKeys = true,keyProperty = "uid")
    @Insert("insert into user(username,password) values(#{username},#{password})")
    void insUser(User user);

    @Delete("delete from user where uid=#{uid}")
    void delete(int uid);
}
