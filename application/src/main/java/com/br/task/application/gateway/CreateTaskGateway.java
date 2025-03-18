package com.br.task.application.gateway;

import com.br.task.core.domain.Task;
import com.br.task.core.exceptions.TaskAlreayExist;

public interface CreateTaskGateway {
    void create(Task task) throws TaskAlreayExist;
}
