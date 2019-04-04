package com.xavier.demo3;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void find() {
        System.out.println("find");
    }

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
}
