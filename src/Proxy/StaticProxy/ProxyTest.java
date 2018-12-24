package Proxy.StaticProxy;

import Proxy.HelloSpeaker;
import Proxy.Ihello;

public class ProxyTest {
    public static void main(String[] args) {
        Ihello proxyIhello = new HelloProxy(new HelloSpeaker());

        proxyIhello.sayHello("liupeng");

    }

}
