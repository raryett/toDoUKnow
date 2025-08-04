package com.example.todouknow.Dto;

import com.example.todouknow.Model.Enums.PrioridadeTarefa;
import com.example.todouknow.Model.Enums.StatusTarefa;

public record TarefaRequestDTO(String nome, PrioridadeTarefa prioridadeTarefa, StatusTarefa statusTarefa ) {

}
