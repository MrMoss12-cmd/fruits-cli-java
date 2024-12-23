package com.example.demo.menu;

import com.example.demo.saludame.SaludaRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MenuRunner {
    private final MenuService menuService;
    private final SaludaRunner saludaRunner;

    @Autowired
    public MenuRunner(MenuService menuService, SaludaRunner saludaRunner) {
        this.menuService = menuService;
        this.saludaRunner = saludaRunner;

        
        menuService.registrarOpcion(1, "Salúdame");
        menuService.registrarOpcion(2, "Salir");
    }

    public void mostrarMenu(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\n*** Menú FRUITS ***");
            menuService.obtenerOpciones().forEach((id, descripcion) -> 
                System.out.println(id + ". " + descripcion));
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> saludaRunner.ejecutar(scanner);
                case 2 -> {
                    System.out.println("¡Adiós!");
                    running = false;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
