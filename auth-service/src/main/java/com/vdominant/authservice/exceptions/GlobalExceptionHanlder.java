package com.vdominant.authservice.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHanlder {
    @ExceptionHandler
    public ResponseEntity<String> handleExistedAccount(AccountExistException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler
    public ResponseEntity<String> handleInvalidUserInformation(InvalidUserException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
