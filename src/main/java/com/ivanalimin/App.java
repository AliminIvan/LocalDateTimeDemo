package com.ivanalimin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;

/*
Работа с датами одна из самых частовстречающихся задач в работе. Уделите этой теме должное внимание.
Для тренировки предлогаю вам задачу, на вход вам дается время в виде класса LocalDateTime, орисуйте его в виде:

год:месяц:день##:час:минут:секунды:милисекунды

Используйте для этого аннотации jackson в спринге. И не забудьте про локаль.
 */

public class App {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        SomeEntity someEntity = new SomeEntity(LocalDateTime.now());
        String s = mapper.writeValueAsString(someEntity);
        System.out.println(s);
    }
}
