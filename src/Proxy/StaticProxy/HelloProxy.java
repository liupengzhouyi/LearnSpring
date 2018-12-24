package Proxy.StaticProxy;

import Proxy.Ihello;

public class HelloProxy implements Ihello {

    private Ihello ihello = null;

    public HelloProxy(Ihello ihello) {
        this.ihello = ihello;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("show proxy class!");
        this.ihello.sayHello(name);
        System.out.println("show proxy class over!");
    }
}
