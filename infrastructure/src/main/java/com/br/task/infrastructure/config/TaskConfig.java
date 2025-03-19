package com.br.task.infrastructure.config;

import com.br.task.application.impl.*;
import com.br.task.core.repositories.TaskRepository;
import com.br.task.infrastructure.mapper.TaskMapper;
import com.br.task.infrastructure.repositories.TaskEntityRepository;
import com.br.task.infrastructure.service.CreateTaskGatewayImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {

    @Bean
    public CreateTaskUseCaseImpl createTaskUseCase(){
        return new CreateTaskUseCaseImpl();
    }

    @Bean
    public DeleteTaskUseCaseImpl deleteTaskUseCase(){
        return new DeleteTaskUseCaseImpl();
    }

    @Bean
    public GetListTaskUseCaseImpl getListTaskUseCase(){
        return new GetListTaskUseCaseImpl();
    }

    @Bean
    public GetTaskUseCaseImpl getTaskUseCase(){
        return new GetTaskUseCaseImpl();
    }

    @Bean
    public MarkTaskCompletedImpl markTaskCompleted(){
        return new MarkTaskCompletedImpl();
    }

    @Bean
    public UpdateTaskUseCaseImpl updateTaskUseCase(){
        return new UpdateTaskUseCaseImpl();
    }

    @Bean
    public CreateTaskGatewayImpl createTaskGatewayImpl(){
        return new CreateTaskGatewayImpl();
    }

    @Bean
    public TaskRepository taskRepository(){
        return new TaskRepository() {
            @Override
            public boolean existsTaskById(Long id) {
                return false;
            }
        };
    }
}
