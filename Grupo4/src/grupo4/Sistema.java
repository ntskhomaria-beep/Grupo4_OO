/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4;
import java.util.ArrayList;

/**
 *
 * @author n.tskhomaria
 */
public class Sistema {
    private ArrayList<Usuario>usuarios=new ArrayList<>();
   
    public void registrarUsuario(String id, String contrasenia, String nombre, String gmail) {
        Usuario nuevo = new Usuario(id, contrasenia, nombre, gmail);
        usuarios.add(nuevo);
        System.out.println("Se ha registrado correctamente.");
    }
   

 public boolean iniciarSesion(String id, String contrasenia, int intentos) {
     intentos=4;
     
        for (Usuario u : usuarios) {
            if (u.getId().equals(id) && u.getContrasenia().equals(contrasenia)) {
                System.out.println("Bienvenido, " +id + "!");
                return true;
            }
        }
        System.out.println("Usuario o contraseña incorrectos.");
        System.out.println("Vuelve a intentarlo.");
        System.out.println("Te quedan: ");
        return false;
    }
}
