package org.example;

import org.example.services.EmailService;
import org.example.services.PedidoService;
import org.example.services.SmsService;


public class Main {
    public static void main(String[] args)
    {
        Notificacao email = new EmailService();
         Notificacao sms = new SmsService();
    PedidoService pedido = new PedidoService(email);
    PedidoService pedido2 = new PedidoService(sms);
    pedido.criarPedido();
    pedido2.criarPedido();



    }
}