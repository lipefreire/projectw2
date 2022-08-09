package br.edu.ifsertaope.cs.projetoweb.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsertaope.cs.projetoweb.categoria.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listando() {
		return "Testando REST.";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1, "Frios");
		Categoria cat2 = new Categoria(1, "Cereais");
		
		List<Categoria> lista = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
}
