package demo1;

import ncl.test.Myconfigration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext(Myconfigration.class);
        System.out.println(act.getBean("testRedis"));

        int a = 1;
        double b = 2;
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        aa.add(bb);//a+b
        aa.subtract(bb);//a-b
        aa.multiply(bb);//a乘以b
        aa.divide(bb);//a除以b



    }
}
