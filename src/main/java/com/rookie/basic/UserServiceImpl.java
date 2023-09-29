package com.rookie.basic;

/**
 * @author yayee
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public void login(String name, String password) {
        userDao.queryUserByNameAndPassword(name, password);
    }

    @Override
    public void register(User user) {
        userDao.save(user);
    }
}
