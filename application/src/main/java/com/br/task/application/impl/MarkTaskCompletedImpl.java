package com.br.task.application.impl;

import com.br.task.application.gateway.MarkTaskCompletedGateway;
import com.br.task.core.domain.Task;
import com.br.task.usecase.MarkTaskCompleted;

public class MarkTaskCompletedImpl implements MarkTaskCompleted {

    private MarkTaskCompletedGateway markTaskCompletedGateway;

    public MarkTaskCompletedImpl(MarkTaskCompletedGateway markTaskCompletedGateway){
        this.markTaskCompletedGateway = markTaskCompletedGateway;
    }

    public MarkTaskCompletedImpl() {
    }

    @Override
    public boolean markCompleted(Task task) {
        return markTaskCompletedGateway.markCompleted(task);
    }
}
