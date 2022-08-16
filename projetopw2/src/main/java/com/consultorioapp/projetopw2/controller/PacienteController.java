package com.consultorioapp.projetopw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.consultorioapp.projetopw2.models.Paciente;
import com.consultorioapp.projetopw2.repository.PacienteRepository;

@Controller
public class PacienteController {
	
	@Autowired
	private PacienteRepository pr;
	
	@RequestMapping(value = "/cadastrarPaciente", method = RequestMethod.GET)
	public String form() {
		return "evento/formPaciente";
	}
	
	@RequestMapping(value="/cadastrarPaciente", method = RequestMethod.POST)
	public String form(Paciente paciente) {
		
		pr.save(paciente);
		
		return "redirect:/cadastrarPaciente";
	}
	
	@RequestMapping("/pacientes")
	public ModelAndView listaPacientes() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Paciente> pacientes = pr.findAll();
		mv.addObject("paciente", pacientes);
		return mv;
	}
}