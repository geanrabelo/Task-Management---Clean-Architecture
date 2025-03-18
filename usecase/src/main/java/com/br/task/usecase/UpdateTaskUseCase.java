package com.br.task.usecase;

import com.br.task.core.domain.Task;
import com.br.task.core.exceptions.TaskNotExists;

public interface UpdateTaskUseCase {
    boolean update(Long id, Task task) throws TaskNotExists;
}
