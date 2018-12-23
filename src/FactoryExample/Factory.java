package FactoryExample;

public class Factory {
    private Human human = null;

    public Human getHuman() {
        return human;
    }

    public void setHuman(String string) {
        if (string.equals("man")) {
            this.human = new Man();
        } else if (string.equals("women")) {
            this.human = new Women();
        } else {
            System.out.println("设置空对象！");
            this.human = null;
        }
    }
}
