package FactoryExample;

public class Man implements Human {
    @Override
    public void eat() {
        System.out.println("男人吃饭，吃完饭打炮！");
    }

    @Override
    public void walk() {
        System.out.println("男人走路，走完路打不了炮！");
    }

    @Override
    public void show() {
        if (this.equals(null)) {
            System.out.println("空对象");
        } else {
            this.eat();
            this.walk();
        }
    }
}
