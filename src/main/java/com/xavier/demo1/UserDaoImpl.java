package com.xavier.demo1;

import org.springframework.stereotype.Repository;

// @Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void find() {
        System.out.println("find");
    }
}
