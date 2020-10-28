package demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Demo1Configration {

    @Bean
    public TestDemo1 testDemo1() {

                   System.out.println("66666665555");
        return new TestDemo1();
    }
}
