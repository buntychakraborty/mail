package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {

	@Autowired
	private JavaMailSender javaMailSender;

	public void send(String to, String body, String sub) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("");
		
		mailMessage.setTo(to);
		mailMessage.setSubject(sub);
		mailMessage.setText(body);
		javaMailSender.send(mailMessage);
	}
}
