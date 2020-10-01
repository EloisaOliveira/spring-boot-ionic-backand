package com.eloisa.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.eloisa.cursomc.domain.Cliente;
import com.eloisa.cursomc.domain.Pedido;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido obj);

    void sendEmail(SimpleMailMessage msg);

    void sendNewPasswordEmail(Cliente cliente, String newPass);
    
}
