package com.hello.hellospring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Hello from Spring Tom Cat";
    }

    @RequestMapping("/hello")
    public HelloService sayHello() {
        HelloService hello = new HelloService();

        return hello;
    }
}
