package com.br.task.application.impl;

import com.br.task.application.gateway.CreateTaskGateway;
import com.br.task.core.domain.Task;
import com.br.task.core.enums.EnumCode;
import com.br.task.core.exceptions.TaskAlreayExist;
import com.br.task.core.repositories.TaskRepository;
import com.br.task.usecase.CreateTaskUseCase;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private TaskRepository taskRepository;
    private CreateTaskGateway createTaskGateway;

    public CreateTaskUseCaseImpl(TaskRepository taskRepository, CreateTaskGateway createTaskGateway){
        this.taskRepository = taskRepository;
        this.createTaskGateway = createTaskGateway;
    }

    public CreateTaskUseCaseImpl() {
    }

    @Override
    public void create(Task task) throws TaskAlreayExist {
        createTaskGateway.create(task);
    }
}
