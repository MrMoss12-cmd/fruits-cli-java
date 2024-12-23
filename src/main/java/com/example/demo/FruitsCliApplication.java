package com.example.demo;

import com.example.demo.menu.MenuRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FruitsCliApplication implements CommandLineRunner {

    private final MenuRunner menuRunner;

    @Autowired
    public FruitsCliApplication(MenuRunner menuRunner) {
        this.menuRunner = menuRunner;
    }

    public static void main(String[] args) {
        SpringApplication.run(FruitsCliApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        menuRunner.mostrarMenu(scanner);
    }
}
