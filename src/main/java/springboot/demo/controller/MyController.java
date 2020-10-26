package springboot.demo.controller;

import ncl.test.TestRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyController {
    @Autowired
    TestRedis testRedis;

    @RequestMapping("/test")
    public String test() {
        String str = testRedis.getMessage();
        return str;
    }
}
