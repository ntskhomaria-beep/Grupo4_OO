package grupo4;

import java.util.ArrayList;


public class Usuario {

    private String id;
    private String contrasenia;
    private String nombre;
    private String gmail;
    private Suscripcion suscripcion;
    private int streamsVistosHoy = 0;

    public Usuario(String id, String contrasenia, String nombre, String gmail) {
        this.id=id;
        this.contrasenia=contrasenia;
        this.nombre=nombre;
        this.gmail=gmail;
    }

    public String getId() {
        return id;
    }

    public String getContrasenia() {
        return contrasenia;
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

}