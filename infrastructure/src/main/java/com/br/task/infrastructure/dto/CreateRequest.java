package com.br.task.infrastructure.dto;

import com.br.task.core.enums.Status;

public record CreateRequest(String tittle,
                            String description,
                            Status status) {
}
