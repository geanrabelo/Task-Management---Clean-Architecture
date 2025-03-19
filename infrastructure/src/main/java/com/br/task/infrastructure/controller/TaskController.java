package com.br.task.infrastructure.controller;

import com.br.task.core.exceptions.TaskAlreayExist;
import com.br.task.infrastructure.dto.CreateRequest;
import com.br.task.infrastructure.dto.ResponseDTO;
import com.br.task.infrastructure.entity.TaskEntity;
import com.br.task.infrastructure.mapper.TaskMapper;
import com.br.task.infrastructure.repositories.TaskEntityRepository;
import com.br.task.infrastructure.service.CreateTaskGatewayImpl;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final CreateTaskGatewayImpl createTaskGateway;
    private final TaskEntityRepository taskEntityRepository;
    private final TaskMapper taskMapper;

    public TaskController(CreateTaskGatewayImpl createTaskGateway, TaskEntityRepository taskEntityRepository, TaskMapper taskMapper){
        this.createTaskGateway = createTaskGateway;
        this.taskEntityRepository = taskEntityRepository;
        this.taskMapper = taskMapper;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<?> create(@RequestBody @Valid CreateRequest createRequest, UriComponentsBuilder uriComponentsBuilder) throws TaskAlreayExist {
        var task = taskMapper.toTask(createRequest);
        createTaskGateway.create(task);
        var uri = uriComponentsBuilder.path("/tasks").buildAndExpand(task).toUri();
        return ResponseEntity.created(uri).body(new ResponseDTO("Task created sucessful"));
    }
}
