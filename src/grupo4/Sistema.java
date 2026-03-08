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
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void registrarUsuario(String id, String contrasenia){
        Usuario nuevo = new Usuario(id, contrasenia);
        usuarios.add(nuevo);
        System.out.println("Se ha registrado correctamente.");
    }

    // Opcional: buscar usuario por id
    public Usuario buscarUsuario(String id){
        for(Usuario u : usuarios){
            if(u.getId().equals(id)) return u;
        }
        return null;
    }
}