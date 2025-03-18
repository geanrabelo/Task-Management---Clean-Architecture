package com.br.task.application.impl;

import com.br.task.application.gateway.GetTaskGateway;
import com.br.task.core.domain.Task;
import com.br.task.core.enums.EnumCode;
import com.br.task.core.exceptions.TaskAlreayExist;
import com.br.task.core.repositories.TaskRepository;
import com.br.task.usecase.GetTaskUseCase;

public class GetTaskUseCaseImpl implements GetTaskUseCase {

    private TaskRepository taskRepository;

    private GetTaskGateway getTaskGateway;

    public GetTaskUseCaseImpl() {
    }

    public GetTaskUseCaseImpl(TaskRepository taskRepository, GetTaskGateway getTaskGateway){
        this.taskRepository = taskRepository;
        this.getTaskGateway = getTaskGateway;
    }
    @Override
    public Task getTaskById(Long id) throws TaskAlreayExist {
        if(taskRepository.existsTaskById(id)){
            return getTaskGateway.getTaskById(id);
        }else {
            throw new TaskAlreayExist(EnumCode.TAS0002.getMessage(), EnumCode.TAS0002.getCode());
        }
    }
}
