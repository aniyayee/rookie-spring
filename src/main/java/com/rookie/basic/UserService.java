package com.rookie.basic;

/**
 * @author yayee
 */
public interface UserService {

    void login(String name, String password);

    void register(User user);
}
