package com.example.todouknow.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name="tag")

public class TagModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @ManyToMany(mappedBy = "tags")
    private Set<TarefaModel> tarefaModels;








}
