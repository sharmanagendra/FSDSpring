package com.mentor.common;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.mentor.entity.User;

import java.util.List;

public interface UserRepository extends Repository<User, Integer> {

    void delete(User user);

    List<User> findAll();

    User findOne(int id);

    User save(User user);
   
    @Query("select user from User user where user.userName=? and user.password=?")
    User findUser(String userName,String password);
}
