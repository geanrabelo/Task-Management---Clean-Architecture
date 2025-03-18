package com.br.task.infrastructure.repositories;

import com.br.task.core.domain.Task;
import com.br.task.core.repositories.TaskRepository;
import com.br.task.infrastructure.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskEntityRepository extends JpaRepository<TaskEntity, Long> {

}
