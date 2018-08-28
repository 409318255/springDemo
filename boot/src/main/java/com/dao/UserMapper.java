package com.dao;

import com.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User findByUserNameAndPassword(@Param("userName")String userName,@Param("password") String password);
}