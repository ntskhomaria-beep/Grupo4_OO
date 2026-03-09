/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */  

package grupo4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamOPT {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
        
        
        //CREACION DE TIPOS DE STREAM (ARRAYLISTS)
        
ArrayList<Pelicula> peliculas = new ArrayList<>();


peliculas.add(new Pelicula(
    "Drive", 3000000, "Anchor Bay Films", "R", "Cine",
    new ArrayList<>(List.of("Red Bull", "TAG Heuer")),
    100, "Acción/Thriller",
    "Un conductor especializado en fugas se ve envuelto en un plan criminal que sale mal.",
    new ArrayList<>(List.of("Ryan Gosling", "Carey Mulligan"))
));

peliculas.add(new Pelicula(
    "Scream", 5000000, "Dimension Films", "R", "Cine",
    new ArrayList<>(List.of("Pepsi", "Sony")),
    111, "Terror/Slasher",
    "Un asesino enmascarado aterroriza a la ciudad de Woodsboro mientras los adolescentes intentan sobrevivir.",
    new ArrayList<>(List.of("Neve Campbell", "Courteney Cox"))
));

peliculas.add(new Pelicula(
    "American Pie", 4000000, "Universal Pictures", "R", "Cine",
    new ArrayList<>(List.of("Coca-Cola", "Apple")),
    95, "Comedia/Romance",
    "Un grupo de adolescentes hace un pacto para perder su virginidad antes de graduarse.",
    new ArrayList<>(List.of("Jason Biggs", "Alyson Hannigan"))
));

peliculas.add(new Pelicula(
    "Final Destination", 3500000, "New Line Cinema", "R", "Cine",
    new ArrayList<>(List.of("Canon", "Nike")),
    98, "Terror/Suspense",
    "Un joven tiene una premonición de un accidente mortal y sus amigos deben escapar de la muerte.",
    new ArrayList<>(List.of("Kris Lemche", "Ali Larter"))
));

peliculas.add(new Pelicula(
    "Friday 13th", 2500000, "Paramount Pictures", "R", "Cine",
    new ArrayList<>(List.of("Jeep", "Pepsi")),
    95, "Terror/Slasher",
    "Un grupo de jóvenes llega a un campamento donde un asesino misterioso los acecha.",
    new ArrayList<>(List.of("Betsy Palmer", "Adrienne King"))
));

peliculas.add(new Pelicula(
    "The Conjuring", 6000000, "Warner Bros", "R", "Cine",
    new ArrayList<>(List.of("Samsung", "Coca-Cola")),
    112, "Terror/Sobrenatural",
    "Los investigadores paranormales Ed y Lorraine Warren ayudan a una familia acosada por fuerzas oscuras.",
    new ArrayList<>(List.of("Patrick Wilson", "Vera Farmiga"))
));

      ArrayList<Series> series = new ArrayList<>();

series.add(new Series(
    "The Boys", 7000000, "Amazon Prime", 8.7, "Streaming",
    3, 24, "Acción/Satírico",
    new ArrayList<>(List.of("Karl Urban", "Jack Quaid")),
    "18+", "Basada en cómics"
));

series.add(new Series(
    "Dexter", 6000000, "Showtime", 8.6, "TV",
    8, 96, "Drama/Crimen",
    new ArrayList<>(List.of("Michael C. Hall", "Jennifer Carpenter")),
    "18+", "Original"
));

series.add(new Series(
    "Peacemaker", 5000000, "HBO Max", 7.9, "Streaming",
    1, 8, "Acción/Comedia",
    new ArrayList<>(List.of("John Cena", "Steve Agee")),
    "16+", "Spin-off de películas"
));

series.add(new Series(
    "Supernatural", 9000000, "The CW", 8.4, "TV",
    15, 327, "Fantasía/Horror",
    new ArrayList<>(List.of("Jared Padalecki", "Jensen Ackles")),
    "16+", "Original"
));

series.add(new Series(
    "Stranger Things", 8000000, "Netflix", 8.9, "Streaming",
    4, 34, "Ciencia ficción/Terror",
    new ArrayList<>(List.of("Millie Bobby Brown", "Finn Wolfhard")),
    "13+", "Original"
));

       ArrayList<Videojuegos> videojuegos = new ArrayList<>();

videojuegos.add(new Videojuegos(
    "Mortal Kombat XL", 7000000, "NetherRealm Studios", "M", "PC",
    new ArrayList<>(List.of("Warner Bros")), "Mortal Kombat", "Lucha",
    "18+", 50, "Lucha/Fantasía", true
));

videojuegos.add(new Videojuegos(
    "Need for Speed Underground 2", 9000000, "Electronic Arts", "E", "PC",
    new ArrayList<>(List.of("Nike", "Sony")), "Need for Speed", "Carreras",
    "E", 40, "Carreras/Tuning", true
));

videojuegos.add(new Videojuegos(
    "The Witcher 3: Wild Hunt", 12000000, "CD Projekt", "M", "PC",
    new ArrayList<>(List.of("Razer", "Intel")), "The Witcher", "RPG",
    "18+", 60, "RPG/Aventura", false
));

videojuegos.add(new Videojuegos(
    "God of War", 10000000, "Santa Monica Studio", "M", "PS4",
    new ArrayList<>(List.of("Sony")), "God of War", "Acción/Aventura",
    "18+", 70, "Acción/Aventura", false
));

videojuegos.add(new Videojuegos(
    "Minecraft", 15000000, "Mojang", "E10+", "Multiplataforma",
    new ArrayList<>(List.of("Microsoft")), "Minecraft", "Sandbox",
    "E10+", 30, "Sandbox/Aventura", false
));

        System.out.println("===== BIENVENIDO A SteamOPT =====");

boolean registrado = false;
Usuario usuarioActual = null;

while (!registrado) {
    System.out.println("Debes registrarte para continuar.");

    String id = "";
    while (true) {
        System.out.print("Usuario (solo letras): ");
        id = scanner.nextLine();
        if (id.matches("[a-zA-Z]+")) { // solo letras
            break;
        } else {
            System.out.println("Usuario inválido. Solo se permiten letras.");
        }
    }

     System.out.print("Contraseña (puede incluir letras, números o símbolos): ");
    String pass = scanner.nextLine(); // se acepta cualquier combinación

    // Registrar usuario y recuperar objeto
    sistema.registrarUsuario(id, pass);
    usuarioActual = sistema.buscarUsuario(id);
    registrado = true;
}

        // Añadir cuenta bancaria
System.out.println("\nAñade tu cuenta bancaria:");

System.out.print("Número de cuenta: ");
String numero = scanner.nextLine();

System.out.print("Titular: ");
String titular = scanner.nextLine();

// Validar saldo inicial
double saldo = -1;
while (saldo < 0) { // saldo no puede ser negativo
    try {
        System.out.print("Saldo inicial: ");
        String entrada = scanner.nextLine();
        saldo = Double.parseDouble(entrada); // convierte string a double
        if (saldo < 0) {
            System.out.println("El saldo no puede ser negativo. Inténtalo de nuevo.");
        }
    } catch (NumberFormatException e) {
        System.out.println("Entrada inválida. Debes escribir un número válido para el saldo.");
    }
}

System.out.print("Tipo de cuenta: ");
String tipo = scanner.nextLine();

System.out.print("Entidad bancaria: ");
String banco = scanner.nextLine();

// Crear cuenta
CuentaBancaria cuenta = new CuentaBancaria(numero, titular, saldo, tipo, banco);
usuarioActual.setCuenta(cuenta);

// Elegir plan
Suscripcion planElegido = elegirPlan(scanner);

// Validar que el saldo sea suficiente
while (usuarioActual.getCuenta().getSaldo() < planElegido.getPrecio()) {
    System.out.println("Saldo insuficiente para el plan elegido.");
    System.out.print("Cantidad a depositar: ");
    double dinero = -1;
    while (dinero < 0) {
        try {
            String entrada = scanner.nextLine();
            dinero = Double.parseDouble(entrada);
            if (dinero < 0) {
                System.out.println("No puedes depositar un valor negativo. Intenta de nuevo:");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Debes escribir un número válido.");
        }
    }
    usuarioActual.getCuenta().depositar(dinero);
}

usuarioActual.setSuscripcion(planElegido);

        // Menú principal...
        boolean activo = true;
while (activo) {

    System.out.println("\n===== MENÚ PRINCIPAL =====");
    System.out.println("1. Ver Stream");
    System.out.println("2. Ver información del plan");
    System.out.println("3. Ver actividad (historial de streams)"); // Nueva opción
    System.out.println("4. Cerrar sesión");

    int opcion = scanner.nextInt();
    scanner.nextLine();

    switch (opcion) {

        case 1:
            usuarioActual.verStream(scanner, peliculas, series, videojuegos);
            break;

        case 2:
            usuarioActual.getSuscripcion().mostrarSuscripcion();
            break;

        case 3:
            // Aquí mostramos la actividad
            usuarioActual.mostrarHistorial();
            break;

        case 4:
            System.out.println("Sesión cerrada.");
            activo = false;
            break;

        default:
            System.out.println("Opción inválida.");
    }
}

        scanner.close();
    } // <- fin de main

    // Método elegirPlan está FUERA de main
    public static Suscripcion elegirPlan(Scanner scanner) {
        System.out.println("===== PLANES DE STREAM OPT =====");
        System.out.println("1. DEMO 72H");
        System.out.println("2. MENSUAL");
        System.out.println("3. ANUAL");
        System.out.println("4. OFERTA FLASH");
        System.out.print("Selecciona una opcion (1-4): ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        Suscripcion plan;
        switch (opcion) {
            case 1:
                plan = new Suscripcion("DEMO 72H", 0, true, false, 7, false, 72);
                break;
            case 2:
                plan = new Suscripcion("MENSUAL", 19.99, false, true, 9999, true, 0);
                break;
            case 3:
                plan = new Suscripcion("ANUAL", 239.88, false, true, 9999, true, 0);
                break;
            case 4:
                plan = new Suscripcion("OFERTA FLASH", 9.99, false, true, 9999, true, 0);
                break;
            default:
                System.out.println("Opción inválida. Se asigna DEMO.");
                plan = new Suscripcion("DEMO 72H", 0, true, false, 7, false, 72);
        }

        System.out.println("Has elegido el plan: " + plan.getNombre());
        return plan;
    }
}
