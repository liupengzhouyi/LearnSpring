package FactoryExample;

public class Women implements Human {
    @Override
    public void eat() {
        System.out.println("女人吃饭！吃完饭被干！");
    }

    @Override
    public void walk() {
        System.out.println("女人走路，和男人一样！");
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
