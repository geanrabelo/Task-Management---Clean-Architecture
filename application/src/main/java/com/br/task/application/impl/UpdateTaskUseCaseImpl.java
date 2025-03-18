package com.br.task.application.impl;

import com.br.task.application.gateway.UpdateTaskGateway;
import com.br.task.core.domain.Task;
import com.br.task.core.enums.EnumCode;
import com.br.task.core.exceptions.TaskNotExists;
import com.br.task.core.repositories.TaskRepository;
import com.br.task.usecase.UpdateTaskUseCase;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private TaskRepository taskRepository;
    private UpdateTaskGateway updateTaskGateway;

    public UpdateTaskUseCaseImpl(TaskRepository taskRepository, UpdateTaskGateway updateTaskGateway){
        this.taskRepository = taskRepository;
        this.updateTaskGateway = updateTaskGateway;
    }

    public UpdateTaskUseCaseImpl() {
    }

    @Override
    public boolean update(Long id, Task task) throws TaskNotExists {
        if(!taskRepository.existsTaskById(id)){
            throw new TaskNotExists(EnumCode.TAS0002.getMessage(), EnumCode.TAS0002.getCode());
        }else{
            return updateTaskGateway.update(id, task);
        }
    }
}
