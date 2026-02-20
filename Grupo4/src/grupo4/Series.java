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
public class Series {
    private int temporadas; 
    private int capitulos; 
    private String genero;
    private ArrayList<String> actores;
    private String clasificacionEdad; 
    private String adaptacion; 
    
    
      public Series(int temporadas, int capitulos,String genero, String clasificacionEdad, String adaptacion){
          this.temporadas=temporadas;
          this.capitulos=capitulos; 
          this.genero=genero; 
          this.actores= new ArrayList<>(); 
          this.clasificacionEdad=clasificacionEdad; 
          this.adaptacion=adaptacion; 
      }
}
