package Proxy;

public class HelloSpeaker implements Ihello {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
}
