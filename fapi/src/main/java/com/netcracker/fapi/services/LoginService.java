package com.netcracker.fapi.services;

import com.netcracker.fapi.entity.User;

public interface LoginService {
    User findByEmail(String email);
}
