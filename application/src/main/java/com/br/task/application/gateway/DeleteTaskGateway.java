package com.br.task.application.gateway;

import com.br.task.core.exceptions.TaskNotExists;

public interface DeleteTaskGateway {
    void deleteById(Long id) throws TaskNotExists;
}
