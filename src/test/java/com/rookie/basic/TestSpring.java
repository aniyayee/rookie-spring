package com.rookie.basic;

import org.junit.Test;

/**
 * @author yayee
 */
public class TestSpring {

    @Test
    public void test() {
        UserService userService = new UserServiceImpl();
        userService.login("aniya", "123");
        User user = new User("snoopy", "123");
        userService.register(user);
    }
}
