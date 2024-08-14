package com.ivanalimin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        SomeEntity someEntity = new SomeEntity(LocalDateTime.now());
        String s = mapper.writeValueAsString(someEntity);
        System.out.println(s);
    }
}
