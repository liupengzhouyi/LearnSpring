package Injection;

public class Australia implements Human{

    private Language language = null;

    public Australia() {
    }

    //构造注入 需要带参数的构造函数
    //Construction injection requires a constructor with parameters
    public Australia(Language language) {
        this.language = language;
    }

    @Override
    public void speak() {
        System.out.println("aussie" + language.kind());
    }
}
