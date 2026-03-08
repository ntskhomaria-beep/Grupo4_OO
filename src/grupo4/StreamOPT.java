/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */  

package grupo4;

import java.util.ArrayList;
import java.util.Scanner;

public class StreamOPT {

    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        ArrayList<Series> series = new ArrayList<>();
        ArrayList<Videojuegos> videojuegos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();

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

    String pass = "";
    while (true) {
        System.out.print("Contraseña (solo letras): ");
        pass = scanner.nextLine();
        if (pass.matches("[a-zA-Z]+")) { // solo letras
            break;
        } else {
            System.out.println("Contraseña inválida. Solo se permiten letras.");
        }
    }

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
            System.out.println("3. Cerrar sesión");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    usuarioActual.verStream();
                    break;
                case 2:
                    usuarioActual.getSuscripcion().mostrarSuscripcion();
                    break;
                case 3:
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
