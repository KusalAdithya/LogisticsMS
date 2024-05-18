package com.waka.remote;

import jakarta.ejb.Remote;

@Remote
public interface Login {
    boolean login(String username, String password);
}
