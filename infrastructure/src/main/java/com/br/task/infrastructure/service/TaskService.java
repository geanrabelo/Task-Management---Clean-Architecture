package com.br.task.infrastructure.service;

import com.br.task.application.gateway.*;
import com.br.task.application.impl.*;
import com.br.task.core.domain.Task;
import com.br.task.core.exceptions.TaskAlreayExist;
import com.br.task.core.exceptions.TaskNotExists;
import com.br.task.core.repositories.TaskRepository;
import com.br.task.infrastructure.mapper.TaskMapper;
import com.br.task.infrastructure.repositories.TaskEntityRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements CreateTaskGateway, DeleteTaskGateway, GetListTaskGateway, GetTaskGateway, MarkTaskCompletedGateway, UpdateTaskGateway, TaskRepository {

    private final CreateTaskUseCaseImpl createTaskUseCase;
    private final DeleteTaskUseCaseImpl deleteTaskUseCase;
    private final GetListTaskUseCaseImpl getListTaskUseCase;
    private final GetTaskUseCaseImpl getTaskUseCase;
    private final MarkTaskCompletedImpl markTaskCompleted;
    private final UpdateTaskUseCaseImpl updateTaskUseCase;
    private final TaskEntityRepository taskEntityRepository;
    private final TaskMapper taskMapper;

    public TaskService(CreateTaskUseCaseImpl createTaskUseCase, DeleteTaskUseCaseImpl deleteTaskUseCase,
                       GetListTaskUseCaseImpl getListTaskUseCase, GetTaskUseCaseImpl getTaskUseCase,
                       MarkTaskCompletedImpl markTaskCompleted, UpdateTaskUseCaseImpl updateTaskUseCase,
                       TaskEntityRepository taskEntityRepository, TaskMapper taskMapper){
        this.createTaskUseCase = createTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getListTaskUseCase = getListTaskUseCase;
        this.getTaskUseCase = getTaskUseCase;
        this.markTaskCompleted = markTaskCompleted;
        this.updateTaskUseCase = updateTaskUseCase;
        this.taskEntityRepository = taskEntityRepository;
        this.taskMapper = taskMapper;
    }

    @Override
    public void create(Task task) throws TaskAlreayExist {
        createTaskUseCase.create(task);
    }

    @Override
    public void deleteById(Long id) throws TaskNotExists {
        deleteTaskUseCase.delete(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return getListTaskUseCase.getAllTasks();
    }

    @Override
    public Task getTaskById(Long id) throws TaskAlreayExist {
        return getTaskUseCase.getTaskById(id);
    }

    @Override
    public boolean markCompleted(Task task) {
        return markTaskCompleted.markCompleted(task);
    }

    @Override
    public boolean update(Long id, Task task) throws TaskNotExists {
        return updateTaskUseCase.update(id, task);
    }

    @Override
    public boolean existsTaskById(Long id) {
        return taskEntityRepository.existsById(id);
    }
}
