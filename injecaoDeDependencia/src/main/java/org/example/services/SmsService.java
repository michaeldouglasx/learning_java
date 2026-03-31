package org.example.services;

import org.example.Notificacao;

public class SmsService implements Notificacao {
    public void enviarNotificacao(){
        System.out.println("SMS: Seu pedido foi criado!");

    }
}
