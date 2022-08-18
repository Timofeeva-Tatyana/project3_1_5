package com.amr.project.service.abstracts;

import com.amr.project.model.entity.User;

import java.util.List;


public interface UserService {
    List<User> findAll();

    User findById(Long id);

    void deleteById(Long id);

    void persist(User user);

    void update(User user);

    User findUserByEmail(String email);

    public User findByUsername (String username);

    public User findByEmail (String email);

    User findByUserName(String name);

}
