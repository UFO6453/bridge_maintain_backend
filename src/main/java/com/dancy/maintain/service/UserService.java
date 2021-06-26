package com.dancy.maintain.service;

import com.dancy.maintain.pojo.User;
import org.springframework.data.domain.Page;

public interface UserService {
    User login(User user);
    User userCreate(User user);
    Page<User> findAllByPage(Integer pageNum, Integer pageSize, String username);
    int userStateUpdate(Integer id, Boolean state);
    Boolean userDelete(Integer id);
}