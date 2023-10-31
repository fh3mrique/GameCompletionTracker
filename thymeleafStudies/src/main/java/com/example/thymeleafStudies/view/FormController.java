package com.example.thymeleafStudies.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.thymeleafStudies.entities.Game;
import com.example.thymeleafStudies.repositories.GameRepository;

@Controller
public class FormController {
	
	@Autowired
	private GameRepository gameRepository;

	@GetMapping("/form")
    public String showForm(Model model) {
		model.addAttribute("game", new Game());
        return "form/index.html";
    }
	
	@PostMapping("/submit")
	public String processForm(Game game) {
		gameRepository.save(game);
		
		return "redirect:/result.html";
	}
}
