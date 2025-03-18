package com.br.task.usecase;

import com.br.task.core.exceptions.TaskNotExists;

public interface DeleteTaskUseCase {
    void delete(Long id) throws TaskNotExists;
}
