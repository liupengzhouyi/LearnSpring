package FactoryExample;

public class Test {

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.setHuman("man");
        Human human = factory.getHuman();
        human.show();

        factory.setHuman("women");
        human = factory.getHuman();
        human.show();
    }

}
