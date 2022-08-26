package com.consultorioapp.projetopw2.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;


public class PacienteDTO {
	private String nome;
	private String email;
	
	public PacienteDTO convert(Paciente paciente) {
		BeanUtils.copyProperties(paciente, this, "id");
		return this;
	}
	public List<PacienteDTO> convertList(Iterable<Paciente>listPaciente){
		PacienteDTO pacienteDTO = new PacienteDTO();
		List<PacienteDTO> pacienteDTOList = new ArrayList<>();
		listPaciente.forEach(u ->{
			pacienteDTOList.add(pacienteDTO.convert(u));
		});
		return pacienteDTOList;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
