package com.example.todouknow.Dto;

import com.example.todouknow.Model.Enums.PrioridadeTarefa;
import com.example.todouknow.Model.Enums.StatusTarefa;

import java.time.LocalDateTime;

public record TarefaResponseDTO(Integer id, String nome, PrioridadeTarefa prioridadeTarefa, StatusTarefa statusTarefa,
                                LocalDateTime dataCriacao, LocalDateTime dataAtualizacao) {
}
