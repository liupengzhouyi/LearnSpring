package FactoryExample;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SrpingTest {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/spring-config.xml");

        Human human = null;

        human = (Human) ctx.getBean("man");

        human.show();

        human = (Human) ctx.getBean("women");
        human.show();

    }
}
