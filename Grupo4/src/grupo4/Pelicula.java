/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package grupo4;
import java.util.ArrayList;


public class Pelicula extends Entretenimiento{
    private double duracion;
    private String categorias;
    private String sinopsis;
    private String clasifiEdad; 
    ArrayList<String>actores;
    
    public Pelicula(String titulo, int audiencia, String empresa, String valoracion, String plataforma, ArrayList<String> patrocinador, double duracion, String categorias, String sinopsis, ArrayList<String>actor){
        super(titulo, audiencia, empresa, duracion, plataforma, patrocinador);
        this.duracion=duracion;
        this.categorias=categorias;
        this.sinopsis=sinopsis;
        this.actores=actor; 
        
    }
    
    public String mostrarCategorias(){
        return categorias;
    }
    
    public String verSinopsis(){
        return sinopsis;
    }
    public void mostrarActores() {
        System.out.println("Actores:");
        for (String a : actores) { //AQUI se recorre el array mucho mas facil.
            System.out.print(a + ", ");
        }
        System.out.println();
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        // Incluye toda la info de Entretenimiento + datos específicos de Peliculas
        return super.toString()
                + "\nDuración: " + duracion
                + "\nCategoría: " + categorias
                + "\nClasificación de edad: " + clasifiEdad
                + "\nDuración (minutos): " + duracion;
    }
}
