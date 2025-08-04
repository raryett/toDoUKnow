package com.example.todouknow.Service;

import com.example.todouknow.Dto.TarefaRequestDTO;
import com.example.todouknow.Model.Tarefa;

import java.util.List;

public interface TarefaService {


    /// criar tarefa
    Tarefa criarTarefa(TarefaRequestDTO info);

    /// Listar - Read
    List<Tarefa> listarTarefa();
    /// BUSCAR POR ID
    Tarefa buscarTarefaId(int id);

    /// Editar
    Tarefa atualizaTarefas(Integer id, TarefaRequestDTO info);

    /// Deletar
    void excluirTarefa(Integer id);


}
