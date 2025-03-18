package com.br.task.core.exceptions;

public class TaskNotExists extends Exception{
    private String message;
    private int code;

    public TaskNotExists(String message, int code){
        this.message = message;
        this.code = code;
    }
}
