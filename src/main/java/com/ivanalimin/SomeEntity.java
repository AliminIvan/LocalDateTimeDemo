package com.ivanalimin;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class SomeEntity {

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime localDateTime;

    public SomeEntity() {
    }

    public SomeEntity(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
