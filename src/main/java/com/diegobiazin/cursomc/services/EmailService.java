package com.diegobiazin.cursomc.services;

import com.diegobiazin.cursomc.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido pedido);

    void sendEmail(SimpleMailMessage msg);
}
