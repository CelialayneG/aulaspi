package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	
	@RequestMapping("/eventos/form/enviar")
	public String enviar(Evento evento) {
		System.out.println("Os dados foram enviados foram: " + evento.getNome() + ", " + evento.getLocal() + ", " + evento.getData() + ", " + evento.getHorario());
		return "enviar";
	}
	
	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		
		return "evento-adicionado";
	}
}
