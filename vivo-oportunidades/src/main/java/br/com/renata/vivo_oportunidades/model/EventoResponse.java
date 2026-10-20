package br.com.renata.vivo_oportunidades.model;

public class EventoResponse {

    private String evento;
    private String clienteId;
    private String status;
    private String produtoRecomendado;
    private String motivo;

    public EventoResponse(
            String evento,
            String clienteId,
            String status,
            String produtoRecomendado,
            String motivo) {

        this.evento = evento;
        this.clienteId = clienteId;
        this.status = status;
        this.produtoRecomendado = produtoRecomendado;
        this.motivo = motivo;
    }

    public String getEvento() {
        return evento;
    }

    public String getClienteId() {
        return clienteId;
    }

    public String getStatus() {
        return status;
    }

    public String getProdutoRecomendado() {
        return produtoRecomendado;
    }

    public String getMotivo() {
        return motivo;
    }
}