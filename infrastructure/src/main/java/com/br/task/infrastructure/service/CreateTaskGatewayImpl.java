package com.br.task.infrastructure.service;

import com.br.task.application.gateway.CreateTaskGateway;
import com.br.task.core.domain.Task;
import com.br.task.core.exceptions.TaskAlreayExist;
import com.br.task.infrastructure.entity.TaskEntity;
import com.br.task.infrastructure.mapper.TaskMapper;
import com.br.task.infrastructure.repositories.TaskEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CreateTaskGatewayImpl implements CreateTaskGateway {

    @Autowired
    private TaskEntityRepository taskEntityRepository;

    @Override
    public void create(Task task) throws TaskAlreayExist {
        var taskEntity = new TaskEntity(task.getTittle(), task.getDescription(), task.getStatus());
        taskEntityRepository.save(taskEntity);
    }
}
