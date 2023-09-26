package org.examen.controller;

import org.examen.repository.IRepositoryLaptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LaptopController {
	
	@Autowired
	private IRepositoryLaptop repo;
	
	@GetMapping("/listar")
	public String listadoLap(Model model) {
		model.addAttribute("laptop", repo.findAll());
		return "listar";
	}
}
