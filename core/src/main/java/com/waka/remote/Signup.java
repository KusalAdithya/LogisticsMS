package com.waka.remote;

import jakarta.ejb.Remote;

@Remote
public interface Signup {
     boolean signup(String name,String mobile,String username, String password);

}
