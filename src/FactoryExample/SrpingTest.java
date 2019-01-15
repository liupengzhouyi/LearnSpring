package FactoryExample;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SrpingTest {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/spring-config.xml");

        Human human = null;

        //返回 Object 类型 ， 所以要加上 类型转换
        human = (Human) ctx.getBean("man");

        human.show();

        human = (Human) ctx.getBean("women");

        human.show();

    }
}
