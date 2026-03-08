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

        // condicion =!regsitrado --> 
        while (!registrado) {

            System.out.println("Debes registrarte para continuar.");

            System.out.print("Usuario: ");
            String id = scanner.nextLine();

            System.out.print("Contraseña: ");
            String pass = scanner.nextLine();

            System.out.print("Nombre real: ");
            String nombre = scanner.nextLine();

            System.out.print("Gmail: ");
            String gmail = scanner.nextLine();

            sistema.registrarUsuario(id, pass, nombre, gmail);

            usuarioActual = new Usuario(id, pass, nombre, gmail);
            registrado = true;
        }
        
        System.out.println("\nBienvenido a StreamOPT!");
        System.out.println("- - - - - - - - - - - - -");
        System.out.println("");
        System.out.println("Antes de comenzar a navegar, debe elegir un plan: ");
        System.out.println("");

    
        Suscripcion planElegido = elegirPlan(scanner);
        usuarioActual.setSuscripcion(planElegido);

   
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
    }

    //métodos fuera del main (no confundir) 
    public static Suscripcion elegirPlan(Scanner scanner) {

System.out.println("????????????????????????????????????????????????????????????");
System.out.println("?                PLANES DE STREAM OPT                      ?");
System.out.println("????????????????????????????????????????????????????????????");

//DEMO
System.out.println("  [ PLAN: DEMO 72H ]");
System.out.println("  > Horario : Acceso total por 72 horas");
System.out.println("  > Ventajas: Prueba gratuita, 7 slots, Sin compromiso");
System.out.println("  ----------------------------------------------------------");

//MENSUAL 
System.out.println("  [ PLAN: MENSUAL ]");
System.out.println("  > Horario : Acceso Ilimitado 24/7");
System.out.println("  > Ventajas: Soporte prioritario, Multi-stream");
System.out.println("  ----------------------------------------------------------");

//ANUAL
System.out.println("  [ PLAN: ANUAL ]");
System.out.println("  > Horario : Acceso Ilimitado 365 dias");
System.out.println("  > Ventajas: Ahorro del 20%, Emblema VIP, Full HD+");
System.out.println("  ----------------------------------------------------------");

//MENSUAL (OFERTA) 
System.out.println("  [ PLAN: OFERTA FLASH ]");
System.out.println("  > Horario : Tiepmo limitado");
System.out.println("  > Ventajas: Precio minimo historico, Premium");
System.out.println("  ----------------------------------------------------------");
        System.out.println("");

System.out.print("\n  Selecciona una opcion (1-4): ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        Suscripcion plan;

        if (opcion==1) {
            plan = new Suscripcion("DEMO 72H", 0, true, false, 7, false, 72);
        }
        else if (opcion == 2) {
            plan = new Suscripcion("MENSUAL", 19.99, false, true, 9999, true, 0);
        }
        else if (opcion == 3) {
            plan = new Suscripcion("ANUAL", 239.88, false, true, 9999, true, 0);
        }
        else if (opcion == 4) {
            plan = new Suscripcion("OFERTA FLASH", 9.99, false, true, 9999, true, 0);
        }
        else {
            System.out.println("Opción inválida. Se asigna DEMO.");
            plan = new Suscripcion("DEMO 72H", 0, true, false, 7, false, 72);
        }

        System.out.println("Has elegido el plan: " + plan.getNombre());

        return plan;
    }
} 
