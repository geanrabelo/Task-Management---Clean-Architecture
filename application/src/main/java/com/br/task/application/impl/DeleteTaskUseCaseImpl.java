package com.br.task.application.impl;

import com.br.task.application.gateway.DeleteTaskGateway;
import com.br.task.core.enums.EnumCode;
import com.br.task.core.exceptions.TaskNotExists;
import com.br.task.core.repositories.TaskRepository;
import com.br.task.usecase.DeleteTaskUseCase;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {

    private DeleteTaskGateway deleteTaskGateway;
    private TaskRepository taskRepository;

    public DeleteTaskUseCaseImpl(DeleteTaskGateway deleteTaskGateway, TaskRepository taskRepository){
        this.deleteTaskGateway = deleteTaskGateway;
        this.taskRepository = taskRepository;
    }

    public DeleteTaskUseCaseImpl() {
    }

    @Override
    public void delete(Long id) throws TaskNotExists {
        if(taskRepository.existsTaskById(id)){
            deleteTaskGateway.deleteById(id);
        }else{
            throw new TaskNotExists(EnumCode.TAS0002.getMessage(), EnumCode.TAS0002.getCode());
        }
    }
}
