package com.esig.TaskManager;

import java.util.ArrayList;
import java.util.Arrays;

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
//		Usuario user1 = new Usuario(null,"Eduardo");
//		Usuario user2 = new Usuario(null,"Mirna");
//		Tarefa tar1 = new Tarefa(null,"Fazer Teste", 1, user1);
//		Tarefa tar2 = new Tarefa(null,"Editar Teste", 1, user1);
//		Tarefa tar3 = new Tarefa(null,"Fazer Banco de Dados", 2, user2);
//		Tarefa tar4 = new Tarefa(null,"Editar Banco de Dados", 2, user2);
//		
//		user1.setTarefas(Arrays.asList(tar1,tar2));
//		user2.setTarefas(Arrays.asList(tar2,tar4));
//		
//		System.out.println(user1);
//		
//		
//		usuarioRepository.save(user1);
//		usuarioRepository.save(user2);
//		
//		tarefaRepository.save(tar1);
//		tarefaRepository.save(tar2);
//		tarefaRepository.save(tar3);
//		tarefaRepository.save(tar4);
		
	}

}
