package Proxy.DynamicProxy;

import Proxy.HelloSpeaker;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TipHandler implements InvocationHandler {

    private Object subject;

    public TipHandler() {
    }

    public TipHandler(Object object) {
        this.subject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before you do thing!");

        Object object = method.invoke(subject, args);

        System.out.println("after you do thing!");

        return object;
    }
}
