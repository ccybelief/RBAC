package com.atguigu.atcrowdfunding.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.atguigu.atcrowdfunding.bean.User;

public interface UserDao {
     @Select("select * from t_user")
	 List<User> queryAll();
    @Select("select * from t_user where loginacct=#{loginacct} and userpswd=#{userpswd}")
	User query4Login(User user);

}
