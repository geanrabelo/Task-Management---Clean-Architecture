package com.br.task.infrastructure.mapper;

import com.br.task.core.domain.Task;
import com.br.task.core.enums.Status;
import com.br.task.infrastructure.dto.CreateRequest;
import com.br.task.infrastructure.entity.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public Task toTask(TaskEntity taskEntity){
        return new Task(
                taskEntity.getTittle(),
                taskEntity.getDescription(),
                taskEntity.getStatus()
        );
    }
    public TaskEntity toTaskEntity(Task task){
        return new TaskEntity(
                task.getTittle(),
                task.getDescription(),
                task.getStatus()
        );
    }
    public TaskEntity toTaskEntity(CreateRequest createRequest){
        return new TaskEntity(createRequest.tittle(), createRequest.description(), createRequest.status());
    }

}
