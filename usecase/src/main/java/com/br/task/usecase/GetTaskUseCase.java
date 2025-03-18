package com.br.task.usecase;

import com.br.task.core.domain.Task;
import com.br.task.core.exceptions.TaskAlreayExist;

public interface GetTaskUseCase {
    Task getTaskById(Long id) throws TaskAlreayExist;
}
