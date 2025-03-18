package com.br.task.application.gateway;

import com.br.task.core.domain.Task;

import java.util.List;

public interface GetListTaskGateway {
    List<Task> getAllTasks();
}
