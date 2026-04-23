package com.example.dockertest.member;

import java.time.OffsetDateTime;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MemberExceptionHandler {

    @ExceptionHandler(MemberNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, Object> handleMemberNotFound(MemberNotFoundException exception) {
        return Map.of(
                "message", exception.getMessage(),
                "timestamp", OffsetDateTime.now().toString(),
                "status", HttpStatus.NOT_FOUND.value()
        );
    }
}
