package com.esig.TaskManager.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esig.TaskManager.entities.Tarefa;
import com.esig.TaskManager.entities.Tarefa.Status;
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

	@GetMapping(value = "/id/{id}")
	public ResponseEntity<Tarefa> findById(@PathVariable Long id) {
		Tarefa tarefa = tarefaRepository.findById(id).get();
		
		return ResponseEntity.ok().body(tarefa);
	}

	@GetMapping(value = "/titulo/{titulo}")
	public ResponseEntity<List<Tarefa>> findByTitulo(@PathVariable String titulo) {
		List<Tarefa> list = tarefaRepository.findByTituloContaining(titulo);
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/descricao/{descricao}")
	public ResponseEntity<Tarefa> findByDescricao(@PathVariable String descricao) {
		Tarefa tarefa = tarefaRepository.findByDescricao(descricao);
		return ResponseEntity.ok().body(tarefa);
	}

	@GetMapping(value = "/responsavel/{responsavel}")
	public ResponseEntity<Tarefa> findByResponsavel(@PathVariable String responsavel) {
		Tarefa tarefa = tarefaRepository.findByResponsavel(responsavel);
		return ResponseEntity.ok().body(tarefa);
	}

	@GetMapping(value = "/prioridade/{prioridade}")
	public ResponseEntity<Tarefa> findByPrioridade(@PathVariable String prioridade) {
		Tarefa tarefa = tarefaRepository.findByPrioridade(prioridade);
		return ResponseEntity.ok().body(tarefa);
	}

	@GetMapping(value = "/status/{status}")
	public ResponseEntity<Tarefa> findByStatus(@PathVariable String status) {
		Tarefa tarefa = tarefaRepository.findByStatus(status);
		return ResponseEntity.ok().body(tarefa);
	}

	@PostMapping
	public ResponseEntity<Tarefa> save(@RequestBody Tarefa tarefa) {
		Tarefa tarefaSaved = tarefaRepository.save(tarefa);
		return ResponseEntity.ok().body(tarefaSaved);
	}

	@PutMapping
	public ResponseEntity<Tarefa> update(@RequestBody  Tarefa tarefa) {
		Tarefa tarefaUpdated = tarefaRepository.save(tarefa);
		return ResponseEntity.ok().body(tarefaUpdated);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		tarefaRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

	@PutMapping(value = "/{id}/status")
	public ResponseEntity<Tarefa> updateStatus(@PathVariable Long id) {
		Tarefa tarefaUpdated = tarefaRepository.findById(id).get();
		tarefaUpdated.setStatus(Status.CONCLUIDA);
		tarefaUpdated = tarefaRepository.save(tarefaUpdated);
		return ResponseEntity.ok().body(tarefaUpdated);
	}
	
//	@PostMapping
//	public @ResponseBody ResponseEntity<Tarefa> save(Tarefa tarefa) {
//		tarefaRepository.save(tarefa);
//	    return ResponseEntity.ok().body(tarefa);
//	}
	
	

}
