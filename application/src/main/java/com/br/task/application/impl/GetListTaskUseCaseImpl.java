package com.br.task.application.impl;

import com.br.task.application.gateway.GetListTaskGateway;
import com.br.task.core.domain.Task;
import com.br.task.usecase.GetListTaskUseCase;

import java.util.List;

public class GetListTaskUseCaseImpl implements GetListTaskUseCase {

    private GetListTaskGateway getListTaskGateway;

    public GetListTaskUseCaseImpl(GetListTaskGateway getListTaskGateway){
        this.getListTaskGateway = getListTaskGateway;
    }

    public GetListTaskUseCaseImpl() {
    }

    @Override
    public List<Task> getAllTasks() {
        return getListTaskGateway.getAllTasks();
    }
}
