package com.esig.TaskManager.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.esig.TaskManager.entities.Tarefa;

@Component
public class TarefaRepository {
	
	private Map<Long, Tarefa> map = new HashMap<>();

	public void save(Tarefa obj) {
		map.put(obj.getId(), obj);
	}
	
	public Tarefa findById(Long id) {
		return map.get(id);
		
	}
	
	public List<Tarefa> findAll() {
		return new ArrayList<Tarefa>(map.values());
		
	}
	
}
