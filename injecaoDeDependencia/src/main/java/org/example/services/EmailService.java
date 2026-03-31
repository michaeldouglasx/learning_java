package org.example.services;

import org.example.Notificacao;

public class EmailService implements Notificacao {
    public void enviarNotificacao(){
        System.out.println("E-MAIL: Seu pedido foi criado!");

    }
}
