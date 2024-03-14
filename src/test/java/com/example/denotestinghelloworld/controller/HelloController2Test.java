package com.example.denotestinghelloworld.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloController2Test {


    @Autowired
    MockMvc mvc;

    @Test
    void greeting() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/greeting");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Hello World", result.getResponse().getContentAsString());
    }

    @Test
    public  void  testHelloWithName() throws  Exception{
        mvc.perform(get("/greeting?name=hai"))
                .andExpect(content().string("Hello hai"));

    }
}