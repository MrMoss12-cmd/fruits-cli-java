package com.example.demo.saludame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component 
public class SaludaRunner {
	private final SaludaService saludaService;
	
	@Autowired
	public SaludaRunner(SaludaService saludaService) {
		this.saludaService = saludaService;
	}
	
	public void ejecutar(Scanner scanner) {
		System.out.print("Ingrese su nombre: ");
		String nombre = scanner.nextLine();
		System.out.println(saludaService.saludar(nombre));
	}
}