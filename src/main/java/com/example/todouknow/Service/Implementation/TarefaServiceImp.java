package com.example.todouknow.Service.Implementation;


import com.example.todouknow.Dto.TarefaRequestDTO;
import com.example.todouknow.Model.Enums.StatusTarefa;
import com.example.todouknow.Model.Tarefa;
import com.example.todouknow.Repository.TarefaRepository;
import com.example.todouknow.Service.TarefaService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class TarefaServiceImp implements TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    @Override
    public  Tarefa criarTarefa(TarefaRequestDTO info){
        Tarefa novaTarefa = new Tarefa();
        novaTarefa.setNome(info.nome());
        novaTarefa.setPrioridade(info.prioridadeTarefa());
        novaTarefa.setStatus(StatusTarefa.PENDENTE);
        novaTarefa.setDataCriacao(LocalDateTime.now());
        return tarefaRepository.save(novaTarefa);
    }

    @Override
    public List<Tarefa> listarTarefa(){
        return tarefaRepository.findAll();
    }

    @Override
    public Tarefa buscarTarefaId(int id){
        return tarefaRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Tarefa não encontrada"));

    }

    @Override
    public Tarefa atualizaTarefas(Integer id, TarefaRequestDTO info){
        Tarefa tarefaExistente = this.buscarTarefaId(id);
        tarefaExistente.setNome(info.nome());
        tarefaExistente.setPrioridade(info.prioridadeTarefa());
        tarefaExistente.setDataCriacao(LocalDateTime.now());
        return tarefaRepository.save(tarefaExistente);
    }

    @Override
    public void excluirTarefa(Integer id){
        this.buscarTarefaId(id);
        tarefaRepository.deleteById(id);
    }










}
