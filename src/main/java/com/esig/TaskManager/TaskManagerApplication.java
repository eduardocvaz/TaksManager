package com.esig.TaskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.esig.TaskManager.entities.Tarefa;
import com.esig.TaskManager.entities.Usuario;
import com.esig.TaskManager.repositories.TarefaRepository;
import com.esig.TaskManager.repositories.UsuarioRepository;

@SpringBootApplication
public class TaskManagerApplication implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private TarefaRepository tarefaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario user1 = new Usuario(1L,"Eduardo");
		Usuario user2 = new Usuario(2L,"Mirna");
		Tarefa tar1 = new Tarefa(1L,"Fazer Teste", 1, user1);
		Tarefa tar2 = new Tarefa(2L,"Fazer Banco de Dados", 2, user2);
		
		usuarioRepository.save(user1);
		usuarioRepository.save(user2);
		
		tarefaRepository.save(tar1);
		tarefaRepository.save(tar2);
		
	}

}
