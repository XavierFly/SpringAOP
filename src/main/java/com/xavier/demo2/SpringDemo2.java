package com.xavier.demo2;

import org.junit.Test;

public class SpringDemo2 {
    @Test
    public void demo1() {
        ProductDao productDao = new ProductDao();

        ProductDao proxy = (ProductDao) new MyCGLibProxy(productDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.find();
        proxy.delete();
    }
}
