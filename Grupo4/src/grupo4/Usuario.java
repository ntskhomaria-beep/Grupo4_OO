package grupo4;

import java.util.ArrayList;


public class Usuario{
    ArrayList<String> id;
    ArrayList<String> contrasenia;
    //private String id;
    private String nombre;
    private String gmail;
    //private String contrasenia;
    private String tipoSuscripcion; // Por ahora lo dejamos como String
    private String historialVisualizacion; // Por ahora lo dejamos como String
    
    public Usuario(ArrayList<String> id, String nombre, String gmail, ArrayList<String> contrasenia, String tipoSuscripcion,
            String historialVisualizacion){
        this.id = new ArrayList<String>();
        this.nombre = nombre;
        this.gmail = gmail;
        this.contrasenia = new ArrayList<String>();
        this.tipoSuscripcion = tipoSuscripcion;
        this.historialVisualizacion = historialVisualizacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getGmail(){
        return gmail;
    }
    
    public void setGmail(String gmail){
        this.gmail=gmail;
    }
    
    // Falta pulirlo
    public boolean iniciarSesion(String id, String contraseniaa) {
    if (id.equals(this.nombre) && contraseniaa.equals(this.contrasenia)) {
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
    
//  ValorarContenido y verContenido --> Extends Entretenimineto
  public void valorarContenido (Entretenimiento entretenimiento, double critica) {
    System.out.print("Has valorado " );
    entretenimiento.mostrarInformacion();
    System.out.print(" con " + critica + " estrellas.");
  }

  public void restablecerContraseña(ArrayList<String> nuevaContraseña) {
    this.contrasenia = nuevaContraseña;
    System.out.println("Contraseña actualizada correctamente.");
  }
    
  
  
  
  public class gestionId {
    // 2. Declarar el ArrayList (dentro de la clase)
    private ArrayList<String> listaId;
  
    // Constructor
    public gestionId() {
        // 3. Inicializar el ArrayList
        listaId = new ArrayList<>();
    }

    // Método para añadir id
    public void agregarId(String id) {
        listaId.add(id); // Usar .add()
    }

    // Método para mostrar id
    public void mostrarId() {
        System.out.println("ID: " + listaId);
    }
}
  
  public class gestionContrasenia {
    private ArrayList<String> listaContrasenia;
  
    public gestionContrasenia() {
        listaContrasenia = new ArrayList<>();
    }

    public void agregarContrasenia(String contrasenia) {
        listaContrasenia.add(contrasenia); // Usar .add()
    }

    public void mostrarId() {
        System.out.println("Contrasenia: " + listaContrasenia);
    }
}
}
