package com.example.todouknow.Model;


import com.example.todouknow.Enums.PrioridadeTarefa;
import com.example.todouknow.Enums.StatusTarefa;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name="tarefa")

public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @Enumerated(EnumType.STRING)
    private PrioridadeTarefa prioridade;

    @Enumerated(EnumType.STRING)
    private StatusTarefa status;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "data_conclusao")
    private LocalDateTime dataConclusao;

    @ManyToMany
    @JoinTable(
            name = "tarefa_tag",
            joinColumns = @JoinColumn(name = "tarefa_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<TagModel> tags;

}
