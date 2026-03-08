package grupo4;
import java.util.Scanner; 
import java.util.ArrayList;


public class Usuario {
public Scanner scanner;

    private String id;
    private String contrasenia;
    private Suscripcion suscripcion;
    private CuentaBancaria cuenta;
    private ArrayList<Entretenimiento> historialStreams = new ArrayList<>();

  public Usuario(String id, String contrasenia) {
        this.id = id;
        this.contrasenia = contrasenia;
    }

    public String getId() {
        return id;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void verStream() {
    System.out.println("Estás viendo contenido en streaming...");
}
    
    public void setSuscripcion(Suscripcion suscripcion) {
    this.suscripcion = suscripcion;
}

public Suscripcion getSuscripcion() {
    return suscripcion;
}
   
public void setCuenta(CuentaBancaria cuenta) {
    this.cuenta = cuenta;
}


public CuentaBancaria getCuenta() {
    return this.cuenta;
}

   public boolean iniciarSesion(String id, String contrasenia) {
    if (id.equals(this.id) && contrasenia.equals(this.contrasenia)) {
        System.out.println("Usuario correcto.");
        return true;
    } else {
        System.out.println("Usuario o contraseña incorrecta. Vuelva a intentarlo");
        return false;
    }
}
   
   
   
    public void cerrarSesion(){
        System.out.println("Sesion cerrada.");
    }
   
    public void verContenido(Entretenimiento entretenimiento) {
        entretenimiento.mostrarInformacion();
    }
    
public void verStream(Scanner scanner, ArrayList<Entretenimiento> listaStreams) {
    if (listaStreams.isEmpty()) {
        System.out.println("No hay contenido disponible para ver.");
        return;
    }
    System.out.println("===== CONTENIDOS DISPONIBLES =====");
    for (int i = 0; i < listaStreams.size(); i++) {
        System.out.println((i + 1) + ". " + listaStreams.get(i).toString());
    }

    System.out.print("Selecciona el número del contenido que deseas ver: ");
    int opcion = scanner.nextInt();
    scanner.nextLine();

    if (opcion >= 1 && opcion <= listaStreams.size()) {
        Entretenimiento seleccionado = listaStreams.get(opcion - 1);

        System.out.println("\n=== DETALLES DEL CONTENIDO ===");
        System.out.println(seleccionado.mostrarInformacion());
        historialStreams.add(seleccionado);

    }
}
   
// IMPORTANTE!!!:  ValorarContenido y verContenido --> Extends Entretenimineto
  public void valorarContenido (Entretenimiento entretenimiento, double critica) {
    System.out.print("Has valorado " );
    entretenimiento.mostrarInformacion();
    System.out.print(" con " + critica + " estrellas.");
  }

  public void restablecerContraseña(String nuevaContraseña) {
    this.contrasenia = nuevaContraseña;
    System.out.println("Contraseña actualizada correctamente.");
  }
public void mostrarHistorial() {
    if (historialStreams.isEmpty()) {
        System.out.println("No has visto ningún contenido aún.");
        return;
    }
    System.out.println("===== HISTORIAL DE STREAMS: =====");
    for (int i = 0; i < historialStreams.size(); i++) {
        System.out.println((i + 1) + ". " + historialStreams.get(i).mostrarInformacion());
    }
}
public void verStream(Scanner scanner,
                      ArrayList<Pelicula> peliculas,
                      ArrayList<Series> series,
                      ArrayList<Videojuegos> videojuegos) {

    System.out.println("\nElige la categoría que quieres ver:");
    System.out.println("1. Películas");
    System.out.println("2. Series");
    System.out.println("3. Videojuegos");
    System.out.print("Opción: ");
    int opcion = scanner.nextInt();
    scanner.nextLine(); // limpiar buffer

    switch(opcion) {
        case 1:
            if (peliculas.isEmpty()) {
                System.out.println("No hay películas disponibles.");
                return;
            }
            System.out.println("\n===== Películas disponibles =====");
            for (int i = 0; i < peliculas.size(); i++) {
                System.out.println((i+1) + ". " + peliculas.get(i).getTitulo() + " - " + peliculas.get(i).mostrarCategorias());
            }
            System.out.print("Selecciona el número de la película: ");
            int peliSeleccion = scanner.nextInt();
            scanner.nextLine();
            if (peliSeleccion >= 1 && peliSeleccion <= peliculas.size()) {
                Pelicula peli = peliculas.get(peliSeleccion - 1);
                System.out.println("\n--- Detalles ---");
                System.out.println(peli.mostrarInformacion());
                historialStreams.add(peli);
            } else {
                System.out.println("Opción inválida.");
            }
            break;

        case 2:
            if (series.isEmpty()) {
                System.out.println("No hay series disponibles.");
                return;
            }
            System.out.println("\n===== Series disponibles =====");
            for (int i = 0; i < series.size(); i++) {
                System.out.println((i+1) + ". " + series.get(i).getTitulo() + " - " + series.get(i).getGenero());
            }
            System.out.print("Selecciona el número de la serie: ");
            int serieSeleccion = scanner.nextInt();
            scanner.nextLine();
            if (serieSeleccion >= 1 && serieSeleccion <= series.size()) {
                Series serie = series.get(serieSeleccion - 1);
                System.out.println("\n--- Detalles ---");
                System.out.println(serie.mostrarInformacion());
                historialStreams.add(serie);
            } else {
                System.out.println("Opción inválida.");
            }
            break;

        case 3:
            if (videojuegos.isEmpty()) {
                System.out.println("No hay videojuegos disponibles.");
                return;
            }
            System.out.println("\n===== Videojuegos disponibles =====");
            for (int i = 0; i < videojuegos.size(); i++) {
                System.out.println((i+1) + ". " + videojuegos.get(i).getTitulo() + " - " + videojuegos.get(i).mostrarCategoria());
            }
            System.out.print("Selecciona el número del videojuego: ");
            int juegoSeleccion = scanner.nextInt();
            scanner.nextLine();
            if (juegoSeleccion >= 1 && juegoSeleccion <= videojuegos.size()) {
                Videojuegos juego = videojuegos.get(juegoSeleccion - 1);
                System.out.println("\n--- Detalles ---");
                System.out.println(juego.mostrarInformacion());
                historialStreams.add(juego);
            } else {
                System.out.println("Opción inválida.");
            }
            break;

        default:
            System.out.println("Opción inválida.");
    }
}
}