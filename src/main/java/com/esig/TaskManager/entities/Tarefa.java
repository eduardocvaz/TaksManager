package com.esig.TaskManager.entities;

import java.io.Serializable;
import java.util.Objects;

public class Tarefa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String titulo;
	
	private int prioridade;
	
	private Usuario responsavel;

	
	
	public Tarefa(Long id, String titulo, int prioridade, Usuario responsavel) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.prioridade = prioridade;
		this.responsavel = responsavel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
