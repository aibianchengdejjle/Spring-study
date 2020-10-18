package com.jjl;

import com.jjl.pojo.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    // 绑定接口
    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    // 处理代理类对象，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 通过反射机制的invoke方法实现
        Object res = method.invoke(target, args);
        return res;
    }

}