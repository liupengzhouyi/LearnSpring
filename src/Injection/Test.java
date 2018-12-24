package Injection;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("src/spring-config.xml");

        Human human = (Human) fileSystemXmlApplicationContext.getBean("chinese");

        human.speak();
    }

}
