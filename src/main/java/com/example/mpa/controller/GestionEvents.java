package com.example.mpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.mpa.beans.Dispositivo;

@RestController
public class GestionEvents {
	
	@Autowired
	@Qualifier("gadget1")
	Dispositivo dis;
	
	@GetMapping(value="/dispositivo/{movil}/{laptop}")
	public Dispositivo getDispositivo(			
			@PathVariable("movil")String movil, @PathVariable("laptop") String laptop) {
		 
		if(dis != null && dis.toString().isEmpty()) {
		dis.setLaptop(laptop);
		dis.setMovil(movil);
		System.out.println("los campos que llegan son " + dis);
		}
			
	
		return dis;
		
	}

}
