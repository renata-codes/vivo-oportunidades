package br.com.renata.vivo_oportunidades.service;

import org.springframework.stereotype.Service;

import br.com.renata.vivo_oportunidades.model.EventoResponse;

@Service
public class EventoService {

    public EventoResponse buscarEvento() {

        return new EventoResponse(
                "FATURA_PAGA",
                "123",
                "RECEBIDO",
                "CONTA_DIGITAL",
                "12 pagamentos sem atraso"
        );
    }

}