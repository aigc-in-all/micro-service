package com.imooc.user.mapper;

import com.imooc.thrift.user.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select id,name,password,read_name as realName,mobile,email from pe_user where id=#{id}")
    UserInfo getUserById(@Param("id") int id);

    @Select("select id,name,password,read_name as realName,mobile,email from pe_user where name=#{name}")
    UserInfo getUserByName(@Param("name") String name);

    @Insert("insert info pe_user (name,password,real_name,mobile,email) " +
            "values (#{u.name},#{u.password},#{u.realName},#{u.mobile},#{u.email})")
    void registerUser(@Param("u") UserInfo userInfo);
}
