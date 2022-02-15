package com.esig.TaskManager.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esig.TaskManager.entities.Tarefa;
import com.esig.TaskManager.repositories.TarefaRepository;

@RestController
@RequestMapping(value = "/tarefas")
public class TarefaResource {

	@Autowired
	private TarefaRepository tarefaRepository;
	
	
	@GetMapping
	public ResponseEntity<List<Tarefa>> findAll() {
		List<Tarefa> list = tarefaRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Tarefa> findById(@PathVariable Long id) {
		Tarefa tarefa = tarefaRepository.findById(id);
		return ResponseEntity.ok().body(tarefa);
	}
	

}
