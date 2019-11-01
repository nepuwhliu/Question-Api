package com.example.api.service;

import com.example.api.entity.User;

public interface IUserService {

    public User getUserInformation(String username, String password);

}
