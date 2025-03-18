package com.br.task.application.gateway;

import com.br.task.core.domain.Task;

public interface MarkTaskCompletedGateway {
    boolean markCompleted(Task task);
}
