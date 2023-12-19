package com.example.jwt.backend.config;


import com.example.jwt.backend.dto.ErrorDto;
import com.example.jwt.backend.exceptions.AppException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class RestExceptionHandler {
    //------------ AOP ----------------
    @ExceptionHandler(value = {AppException.class})
    @ResponseBody
    public ResponseEntity<ErrorDto> handleException(AppException appException) {
        return ResponseEntity.status(appException.getCode())
                .body(ErrorDto.builder().message(appException.getMessage()).build());
    }
}
