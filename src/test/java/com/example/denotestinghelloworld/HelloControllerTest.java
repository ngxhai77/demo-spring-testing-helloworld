package com.example.denotestinghelloworld;


import com.example.denotestinghelloworld.controller.HelloController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloControllerTest {
    @Test
    void  hello() {
        HelloController helloController = new HelloController();
        String response = helloController.greeting("World");
        Assertions.assertEquals("Hello World",response);
    }
}
