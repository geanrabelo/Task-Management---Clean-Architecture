package com.br.task.usecase;

import com.br.task.core.domain.Task;

public interface MarkTaskCompleted {
    boolean markCompleted(Task task);
}
