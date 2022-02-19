package com.esig.TaskManager;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TaskManagerApplication implements CommandLineRunner{
//
//	@Autowired
//	private UsuarioRepository usuarioRepository;
//	@Autowired
//	private TarefaRepository tarefaRepository;
//	
	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Usuario user1 = new Usuario(null,"Eduardo");
//		Usuario user2 = new Usuario(null,"Mirna");
//		Tarefa tar1 = new Tarefa(null,"Fazer Teste","Fazer testes na aplicação", user1);
//		Tarefa tar2 = new Tarefa(null,"Editar Teste","Editar testes na aplicação", user1);
//		Tarefa tar3 = new Tarefa(null,"Fazer Banco de Dados","Fazer o banco de dados da aplicação", user2);
//		Tarefa tar4 = new Tarefa(null,"Editar Banco de Dados","Editar o banco de dados da aplicação", user2);
//		
//		tar1.setPrioridade(Prioridade.ALTA);
//		tar2.setPrioridade(Prioridade.BAIXA);
//		tar3.setPrioridade(Prioridade.BAIXA);
//		tar4.setPrioridade(Prioridade.BAIXA);
//
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
