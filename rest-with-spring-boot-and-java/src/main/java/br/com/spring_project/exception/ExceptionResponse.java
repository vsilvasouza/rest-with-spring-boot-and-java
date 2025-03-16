package br.com.spring_project.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {
}
