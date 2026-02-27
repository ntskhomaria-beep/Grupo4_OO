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
public class Series extends Entretenimiento {

    private int temporadas; 
    private int capitulos; 
    private String genero;
    private ArrayList<String> actores;
    private String clasificacionEdad; 
    private String adaptacion; 

    public Series(String titulo, int audiencia, String empresa, double critica,
                  String plataforma, ArrayList<String> patrocinadores,
                  int temporadas, int capitulos, String genero,
                  ArrayList<String> actores, String clasificacionEdad,
                  String adaptacion) {

        super(titulo, audiencia, empresa, critica, plataforma, patrocinadores);

        this.temporadas = temporadas;
        this.capitulos = capitulos;
        this.genero = genero;
        this.actores = actores;
        this.clasificacionEdad = clasificacionEdad;
        this.adaptacion = adaptacion;
    }
            
      
      public int getCapitulos(){
          return capitulos; 
      }
      
      public String getGenero(){
          return genero;     
      }
      
      public String getClasificacionEdad(){
          return clasificacionEdad; 
      }
      
      public String getAdaptacion(){
          return adaptacion;
      }
      
      //SETTERS 
      public void setTemporadas(int temporadas){
          this.temporadas=temporadas; 
      }
      
      public void setCapitulos(int capitulos){
          this.capitulos=capitulos;
      }
      
      public void setGenero(String genero){
          this.genero=genero; 
      }
      
      public void setClasificacionEdad(String clasificacionEdad){
          this.clasificacionEdad=clasificacionEdad; 
      }
      
      public void setAdaptacion(String adaptacion){
          this.adaptacion=adaptacion; 
      }
      
     
      
      public void mostrarTemporadas(){
          System.out.println("Número de temporadas: " + temporadas);
      }
      
      public void mostrarActores(){
         System.out.println("Actores que aparecen en esta serie:");
      System.out.println();
      System.out.println("-------------------------------------------------------------------------");
      for (int i = 0; i < actores.size(); i++) {
      System.out.println("Posición " + i + " ? " + actores.get(i));
      }
      }
      @Override
      public String toString(){
          return super.toString()+
                  "\nTemporadas: " + temporadas
                  + "\nCapítulos: " + capitulos
                  + "\nGénero: " + genero
                  + "\nActores: " + actores
                  + "\nClasificación de edad: " + clasificacionEdad
                  + "\nAdaptación: " + adaptacion;
      
      }
      
      
}
