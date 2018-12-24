package Proxy.DynamicProxy;

import Proxy.DynamicProxy.OtherTest.Person;
import Proxy.DynamicProxy.OtherTest.StuInvocationHandler;
import Proxy.DynamicProxy.OtherTest.Student;
import Proxy.HelloSpeaker;
import Proxy.Ihello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {

        //被代理类
        HelloSpeaker helloSpeaker = new HelloSpeaker();

        //代理类
        TipHandler tipHandler = new TipHandler(helloSpeaker);

        Class cla = helloSpeaker.getClass();

        Ihello ihello = (Ihello) Proxy.newProxyInstance(cla.getClassLoader(), cla.getInterfaces(), tipHandler);

        ihello.sayHello("liupeng");

    }
}
