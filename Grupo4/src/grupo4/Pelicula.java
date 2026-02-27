/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package grupo4;

import grupo4.Actor;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author e.bedoya
 */
public class Pelicula extends Entretenimiento{
    private double duracion;
    private String categorias;
    private String sinopsis;
    private Actor[] actor;
    
    public Pelicula(String titulo, int audiencia, String empresa, String valoracion, String plataforma, ArrayList<String> patrocinador, double duracion, String categorias, String sinopsis){
        super(titulo, audiencia, empresa, duracion, plataforma, patrocinador);
        this.duracion=duracion;
        this.categorias=categorias;
        this.sinopsis=sinopsis;
        
        ArrayList<Actor> actores = new ArrayList<Actor>();
    }
    
    public String mostrarCategorias(){
        return categorias;
    }
    
    public String verSinopsis(){
        return sinopsis;
    }
    public void mostrarActores(){
        for (int i = 0; i < actor.length; i++) {
            System.out.print(actor[i] + ", ");
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return super.toString() +
        Arrays.toString(this.actor) + "\nDuracion: " + this.duracion + 
               "\nCategoria: " + this.categorias + "\nSinopsis: " + this.sinopsis;
    }
    
    
    
    
}
