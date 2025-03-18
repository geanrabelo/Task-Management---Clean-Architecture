package com.br.task.core.domain;

import com.br.task.core.enums.Status;

import java.util.Objects;

public class Task {
    private Long id;
    private String tittle;
    private String description;
    private Status status;


    public Task(String tittle, String description, Status status){
        this.tittle = tittle;
        this.description = description;
        this.status = status;
    }
    public boolean taskCompleted(){
        return this.status == Status.Completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
