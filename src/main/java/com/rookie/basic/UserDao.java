package com.rookie.basic;

/**
 * @author yayee
 */
public interface UserDao {

    void save(User user);

    void queryUserByNameAndPassword(String name, String password);
}
