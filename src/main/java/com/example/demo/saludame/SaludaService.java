package com.example.demo.saludame;

import org.springframework.stereotype.Service;

@Service
public class SaludaService {
	public String saludar(String nombre) {
		return "Hola, " + nombre + "! Espero que tengas un gran dia.";
	}
}