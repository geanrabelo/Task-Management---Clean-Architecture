package com.br.task.core.exceptions;

public class TaskAlreayExist extends Exception {

    private int code;
    private String message;

    public TaskAlreayExist(String message, int code) {
        super(message);
        this.code = code;
    }
}
