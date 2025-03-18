package com.br.task.application.gateway;

import com.br.task.core.domain.Task;
import com.br.task.core.exceptions.TaskNotExists;

public interface UpdateTaskGateway {
    boolean update(Long id, Task task) throws TaskNotExists;
}
