package com.example.demo.menu;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class MenuService {
	private final Map<Integer, String> opciones = new LinkedHashMap<>();
	
	public void registrarOpcion(int id, String descripcion){
		opciones.put(id, descripcion);
	}
	
	public Map<Integer, String> obtenerOpciones() {
		return opciones;
	}
}