package com.esig.TaskManager.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esig.TaskManager.entities.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

	List<Tarefa> findByTituloContaining(String titulo);

	Tarefa findByDescricao(String descricao);

	Tarefa findByResponsavel(String responsavel);

	Tarefa findByPrioridade(String prioridade);

	Tarefa findByStatus(String status);



	
}
