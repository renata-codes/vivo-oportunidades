package br.com.renata.vivo_oportunidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.renata.vivo_oportunidades.model.EventoResponse;
import br.com.renata.vivo_oportunidades.service.EventoService;

@RestController
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping("/eventos")
    public EventoResponse teste() {
        return eventoService.buscarEvento();
    }
}
