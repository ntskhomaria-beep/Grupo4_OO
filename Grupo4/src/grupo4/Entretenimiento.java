/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4;

import java.util.ArrayList;
import java.util.Scanner; 

/**
 *
 * @author n.tskhomaria
 */
public class Entretenimiento {
  private String titulo; 
  private int audiencia; 
  private String empresa; 
  private double critica; 
  private String plataforma; 

  
  public Scanner scanner; 
  
    public Entretenimiento(String titulo, int audiencia, String empresa,
            double critica, String plataforma){

        this.titulo = titulo;
        this.audiencia = audiencia;
        this.empresa = empresa;
        this.critica = critica;
        this.plataforma = plataforma;
        
    }
  
    public String getTitulo(){
    return titulo;
}

public String getPlataforma(){
    return plataforma;
}

public double getCritica(){
    return critica;
}

  public double mostrarCritica(){
      return critica;
  }
  
  public void agregarPatrocinador(String agregarP){
       scanner = new Scanner(System.in);
      System.out.println("Introduzca el nombre del patrocinador que quiera agregar: ");
      agregarP=scanner.nextLine(); 
     
      
  }
  
  public String mostrarInformacion(){
        return "Título: " + titulo
                + "\nAudiencia: " + audiencia
                + "\nEmpresa: " + empresa
                + "\nCrítica: " + critica
                + "\nPlataforma: " + plataforma;

    
  }

        
  
    @Override
    public String toString() {
        return "Título: " + titulo
                + "\nAudiencia: " + audiencia
                + "\nEmpresa: " + empresa
                + "\nCrítica: " + critica
                + "\nPlataforma: " + plataforma;

    }
}
  




