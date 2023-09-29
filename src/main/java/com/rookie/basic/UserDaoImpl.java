package com.rookie.basic;

/**
 * @author yayee
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("insert into user = " + user);
    }

    @Override
    public void queryUserByNameAndPassword(String name, String password) {
        System.out.println("query user from user where name = " + name + ", password = " + password);
    }
}
