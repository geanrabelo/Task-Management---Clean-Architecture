package com.br.task.infrastructure.entity;

import com.br.task.core.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "task")
@Table(name = "task")
@Data
@EqualsAndHashCode(of = "id")
public class TaskEntity {

    public TaskEntity(String tittle, String description, Status status) {
        this.tittle = tittle;
        this.description = description;
        this.status = status;
    }

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tittle", nullable = false)
    private String tittle;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
}
