package usjt.br.ArquDesenv_Aula08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import usjt.br.ArquDesenv_Aula08.model.Previsao;
import usjt.br.ArquDesenv_Aula08.repository.PrevisaoRepository;

@Controller
public class PrevisaoController {
	
	@Autowired
	private PrevisaoRepository previsaoRepo;
	
	@GetMapping("/previsao")
	public ModelAndView previsaoDoTempo() {
		ModelAndView mv = new ModelAndView("lista_previsao");
		List<Previsao> previsoes = previsaoRepo.findAll();
		mv.addObject("previsoes", previsoes);
		return mv;
		
	}
	
	
}
