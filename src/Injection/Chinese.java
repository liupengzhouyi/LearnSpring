package Injection;

public class Chinese implements Human {

    private Language language = null;

    @Override
    public void speak() {
        System.out.println("Chinese" + language.kind());
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
