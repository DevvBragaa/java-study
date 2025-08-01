package com.imc.body_calculator.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorView {

    public LocalDateTime timeStamp = LocalDateTime.now();
    public Integer status;
    public String error;
    public String message;
    public String path;

}
