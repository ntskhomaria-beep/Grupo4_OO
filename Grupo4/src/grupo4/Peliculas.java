/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package grupo4;

import grupo4.Actores;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author e.bedoya
 */
public class Peliculas extends Entretenimiento{
    private double duracion;
    private String categorias;
    private String sinopsis;
    private String ubicacion;
    private Actores[] actor;
    int n = 0;
    
    public Peliculas(String titulo, int audiencia, String empresa, String valoracion, String plataforma, ArrayList<String> patrocinador, double duracion, String categorias, String sinopsis, String ubicacion){
        super(titulo, audiencia, empresa, duracion, plataforma);
        this.duracion=duracion;
        this.categorias=categorias;
        this.sinopsis=sinopsis;
        this.ubicacion=ubicacion;
        
        ArrayList<Actores> actor = new ArrayList<Actores>();
    }
    
    public String mostrarCategorias(){
        return categorias;
    }
    public String mostrarSinopsis(){
        return sinopsis;
    }
    public String mostrarUbicacion(){
        return ubicacion;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
                return "Nombre: " + this.getTitulo() + "\nAudiencia: " + this.getAudiencia() + "\nDueños: " + this.getEmpresa() + "\nValoracion: " + this.getCritica() + 
                "\nPlataforma: " + this.getPlataforma() + "\nPatrocinadores: " + this.getPatrocinador() + "\nActores: " + Arrays.toString(this.actor) + "\nDuracion: " + this.duracion + 
                "\nCategoria: " + this.categorias + "\nSinopsis: " + this.sinopsis + "\nUbicacion: " + this.sinopsis;
    }
    
    
    
    
}
