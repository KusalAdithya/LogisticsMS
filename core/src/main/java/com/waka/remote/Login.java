package com.waka.remote;

import com.waka.entity.User;
import jakarta.ejb.Remote;

@Remote
public interface Login {
    User login(String username, String password);
}
