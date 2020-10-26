package demo1;

import ncl.test.Myconfigration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext(Myconfigration.class);
        System.out.println(act.getBean("testRedis"));
    }
}
