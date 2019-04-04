package com.xavier.demo2;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyCGLibProxy implements MethodInterceptor {
    private ProductDao productDao;

    public MyCGLibProxy(ProductDao productDao) {
        this.productDao = productDao;
    }

    public Object createProxy() {
        // 创建核心类
        Enhancer enhancer = new Enhancer();

        // 设置父类
        enhancer.setSuperclass(productDao.getClass());

        // 设置回调
        enhancer.setCallback(this);

        // 生成代理
        Object proxy = enhancer.create();

        return proxy;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if (method.getName().equals("save")) {
            System.out.println("权限校验");
            return methodProxy.invokeSuper(proxy, args);
        }
        return methodProxy.invokeSuper(proxy, args);
    }
}
