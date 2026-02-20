package grupo4;

import java.util.ArrayList;


public class Usuario {
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
    
//    public ArrayList<String> getId(){
//        id.add("User12");
//        return id;
//    }
//    public ArrayList<String> getContrasenia(){
//        contrasenia.add("24214");
//        return contrasenia;
//    }
//    
    
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
    public boolean iniciarSesion(String id, ArrayList<String> contraseniaa) {
    String nombre;
    ArrayList<String> contrasenia;
    if (nombre.equals(nombre) && contrasenia.equals(contrasenia)) {
        return true;
    } else {
        System.out.println("Usuario o contraseña incorrecta. Vuelva a intentarlo");
        return false;
    }
}
    
    public void cerrarSesion(){
        System.out.println("Sesion cerrada.");
    }
    
    public void verContenido extends Entretenimiento () {
        System.out.println("Has valorado " +  mostrarInformacion.getTitulo());
    }
    
//  ValorarContenido y verContenido --> Extends Entretenimineto
  public void valorarContenido extends Entretenimiento (double critica) {
    mostrarInformacion.setPuntuacion(critica);
    System.out.println("Has valorado " +  mostrarInformacion.getTitulo() + " con " + critica + " estrellas.");
  }

  public void restablecerContraseña(ArrayList<String> nuevaContraseña) {
    this.contrasenia = nuevaContraseña;
    System.out.println("Contraseña actualizada correctamente.");
  }
    
}
