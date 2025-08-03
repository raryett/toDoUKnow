package com.example.todouknow.Controller;


import com.example.todouknow.Model.TarefaModel;
import com.example.todouknow.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {


    @Autowired
    ///foi só um teste para verificar se estava funcionanod, precisa colocar na logica do Service ainda
    private TarefaRepository tarefaRepository;


    /// foi só um teste para verificar se estava funcionanod, precisa colocar na logica do Service ainda
    @GetMapping
    public ResponseEntity<List<TarefaModel>> ListarTarefa() {
        List<TarefaModel> listaTarefa = tarefaRepository.findAll();
        return ResponseEntity.ok(listaTarefa);
    }








}
