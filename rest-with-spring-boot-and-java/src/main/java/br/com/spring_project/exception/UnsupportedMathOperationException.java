package br.com.spring_project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class UnsupportedMathOperationException extends RuntimeException {
    public UnsupportedMathOperationException(String message) {
        super(message);
    }
}
