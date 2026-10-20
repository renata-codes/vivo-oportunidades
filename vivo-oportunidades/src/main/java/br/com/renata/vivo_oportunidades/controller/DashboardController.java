package br.com.renata.vivo_oportunidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard() {

        return """
        <!DOCTYPE html>
        <html>
        <head>

            <title>Central de Oportunidades Vivo</title>

            <style>

                body{
                    background:linear-gradient(135deg,#660099,#8E24AA);
                    font-family:Arial,sans-serif;
                    padding:40px;
                }

                .card{
                    background:white;
                    max-width:1000px;
                    margin:auto;
                    padding:40px;
                    border-radius:25px;
                    box-shadow:0 10px 30px rgba(0,0,0,0.25);
                }

                h1{
                    color:#660099;
                    font-size:48px;
                }

                .bloco{
                    background:#f5f5f5;
                    padding:20px;
                    margin-top:20px;
                    border-radius:15px;
                }

                .label{
                    color:#666;
                    font-size:14px;
                    text-transform:uppercase;
                }

                .valor{
                    font-size:32px;
                    font-weight:bold;
                    margin-top:5px;
                }

                .score{
                    color:#2E7D32;
                    font-size:40px;
                    font-weight:bold;
                }

                .beneficio{
                    color:#1565C0;
                    font-size:24px;
                }

                .lista{
                    font-size:22px;
                    line-height:1.8;
                }

                .barra{
                    background:#ddd;
                    border-radius:20px;
                    height:30px;
                    margin-top:15px;
                }

                .progresso{
                    background:#4CAF50;
                    width:92%;
                    height:30px;
                    border-radius:20px;
                }

            </style>

        </head>

        <body>

        <div class="card">

            <h1>📱 Central de Oportunidades Vivo</h1>

            <div class="bloco">
                <div class="label">Evento Recebido</div>
                <div class="valor">FATURA_PAGA</div>
            </div>

            <div class="bloco">
                <div class="label">Cliente</div>
                <div class="valor">123</div>
            </div>

            <div class="bloco">
                <div class="label">Produto Recomendado</div>
                <div class="valor">💳 CONTA DIGITAL</div>
            </div>

            <div class="bloco">
                <div class="label">Score de Oportunidade</div>
                <div class="score">⭐ 92 / 100</div>

                <div class="barra">
                    <div class="progresso"></div>
                </div>
            </div>

            <div class="bloco">

                <div class="label">
                    Motivos da Recomendação
                </div>

                <div class="lista">

                    ✅ 12 pagamentos consecutivos sem atraso<br>
                    ✅ Cliente ativo há mais de 24 meses<br>
                    ✅ Sem pendências financeiras<br>
                    ✅ Perfil compatível com produtos digitais<br>
                    ✅ Alta probabilidade de adesão

                </div>

            </div>

            <div class="bloco">

                <div class="label">
                    Benefício Esperado
                </div>

                <div class="beneficio">

                    Aumentar o relacionamento do cliente com os
                    serviços financeiros da Vivo e ampliar a
                    utilização do ecossistema digital.

                </div>

            </div>

        </div>

        </body>
        </html>
        """;
    }
}