package br.com.alura.adopet.api.service;

import org.springframework.scheduling.annotation.Async;

public interface EmailService {

    @Async
    void enviarEmail(String to, String subject, String message);

}
