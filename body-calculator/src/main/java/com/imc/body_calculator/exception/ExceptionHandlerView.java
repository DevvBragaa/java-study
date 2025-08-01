package com.imc.body_calculator.exception;


import com.imc.body_calculator.dto.ErrorView;
import com.imc.body_calculator.exception.exceptions.UserNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;


@RestControllerAdvice
public class ExceptionHandlerView {

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorView handleBadRequest(
            BadRequestException exception,
            HttpServletRequest request
    ) {
        ErrorView errorView = new ErrorView();
        errorView.setStatus(HttpStatus.BAD_REQUEST.value());
        errorView.setError(HttpStatus.BAD_REQUEST.name());
        errorView.setMessage(exception.getMessage());
        errorView.setPath(request.getServletPath());
        return errorView;
    }
    
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorView handleUserNotFound(
            UserNotFoundException exception,
            HttpServletRequest request
    ) {
        ErrorView errorView = new ErrorView();
        errorView.setStatus(HttpStatus.NOT_FOUND.value());
        errorView.setError(HttpStatus.NOT_FOUND.name());
        errorView.setMessage(exception.getMessage());
        errorView.setPath(request.getServletPath());
        return errorView;
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorView handleValidationExceptions(
            MethodArgumentNotValidException exception,
            HttpServletRequest request
    ) {
        Map<String, String> errors = new HashMap<>();
        exception.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        
        ErrorView errorView = new ErrorView();
        errorView.setStatus(HttpStatus.BAD_REQUEST.value());
        errorView.setError(HttpStatus.BAD_REQUEST.name());
        errorView.setMessage("Validation error: " + errors);
        errorView.setPath(request.getServletPath());
        return errorView;
    }
}
