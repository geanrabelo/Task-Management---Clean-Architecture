package com.br.task.usecase;

import com.br.task.core.domain.Task;
import com.br.task.core.exceptions.TaskAlreayExist;

public interface CreateTaskUseCase {
    void create(Task task) throws TaskAlreayExist;
}
