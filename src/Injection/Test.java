package Injection;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("src/spring-config.xml");

        Human human = (Human) fileSystemXmlApplicationContext.getBean("chinese");

        human.speak();

        Human human1 = (Human) fileSystemXmlApplicationContext.getBean("chinese");

        System.out.println(human.equals(human1));

        System.out.println(human);
        System.out.println(human1);
    }

}
