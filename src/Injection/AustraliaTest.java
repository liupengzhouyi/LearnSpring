package Injection;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AustraliaTest {
    public static void main(String[] args) {

        FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
                new FileSystemXmlApplicationContext("src/spring-config.xml");

        Human human = (Human) fileSystemXmlApplicationContext.getBean("australia");

        human.speak();

    }
}
