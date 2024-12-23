# 🍎 Fruits CLI

Fruits CLI es una aplicación modular en línea de comandos desarrollada en **Java** con **Spring Boot**. La aplicación permite crear y gestionar una pila de servicios que se integran dinámicamente en un menú interactivo y entretenido.

## 🎯 Características

- **Menú Modular:** Un menú principal donde se pueden registrar y seleccionar diferentes servicios.
- **Servicios Personalizables:** Los módulos como "Salúdame" se integran como servicios independientes.
- **Interfaz CLI:** Diseñado para ejecutarse directamente en la terminal con interacción del usuario.


## 🚀 Instalación y Ejecución

Sigue estos pasos para instalar y ejecutar la aplicación en tu entorno local.

### 1. Requisitos Previos

- **Java JDK 17+** instalado en tu máquina.
- **Maven** configurado para gestionar las dependencias.
- **Eclipse IDE** (opcional, para desarrollo).

### 2. Clonar el Repositorio

Clona este repositorio desde GitHub a tu máquina local:

```bash
git clone https://github.com/tu-usuario/fruits-cli.git
cd fruits-cli

### 3.  Compilar y Ejecutar

Compila y ejecuta el proyecto utilizando Maven:

```bash
./mvnw spring-boot:run

O desde tu IDE favorito, ejecuta la clase principal FruitsCliApplication.

### 4. Uso

Una vez iniciada la aplicación, interactúa con el menú en la consola:

```bash
*** Menú FRUITS ***
1. Salúdame
2. Salir
Seleccione una opción:

1: Ingresa tu nombre y recibe un saludo personalizado.
2: Sal del programa.

### 🛠️ Agregar Nuevos Servicios

- 1.Crea un nuevo paquete bajo com.example.fruits, por ejemplo, juegos.
- 2.Agrega un servicio y un runner similares a los existentes.
- 3.Registra la opción en MenuRunner.java:

```bash
menuService.registrarOpcion(3, "Juegos");

### 📜 Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

