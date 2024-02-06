package br.com.alura.adopet.api.service;

import org.springframework.scheduling.annotation.Async;

public interface EmailService {

    void enviarEmail(String to, String subject, String message);

}
