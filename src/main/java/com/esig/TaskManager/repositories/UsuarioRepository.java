package com.esig.TaskManager.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.esig.TaskManager.entities.Usuario;

@Component
public class UsuarioRepository {

	private Map<Long, Usuario> map = new HashMap<>();

	public void save(Usuario obj) {
		map.put(obj.getId(), obj);
	}
	
	public Usuario findById(Long id) {
		return map.get(id);
		
	}
	
	public List<Usuario> findAll() {
		return new ArrayList<Usuario>(map.values());
		
	}
	
}
