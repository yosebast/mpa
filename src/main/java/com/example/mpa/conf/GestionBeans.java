package com.example.mpa.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.mpa.beans.Dispositivo;

@Configuration
public class GestionBeans {
	
	@Bean
	public Dispositivo gadget() {
		return new Dispositivo();
	}
	
	
	@Bean
	public Dispositivo gadget1() {
		return new Dispositivo("Samsung", "Asus");
	}
	
}
