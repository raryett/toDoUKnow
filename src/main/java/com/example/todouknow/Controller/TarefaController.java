package com.example.todouknow.Controller;


import com.example.todouknow.Model.Tarefa;
import com.example.todouknow.Service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tarefas")
public class TarefaController {


    @Autowired
    private TarefaService tarefaService;

    @PostMapping("/salvarTarefa")
    public ResponseEntity<Tarefa> salvarTarefa(@RequestBody Tarefa tarefa) {
        return ResponseEntity.ok(tarefa);
    }








}
