package org.example.services;

import org.example.Notificacao;

public class PedidoService {
    Notificacao notificacao;
    public PedidoService(Notificacao notificacao){
        this.notificacao = notificacao;
    }

    public void criarPedido(){
       notificacao.enviarNotificacao();

    }
}
