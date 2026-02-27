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
  ArrayList<String>patrocinador;
  
  public Scanner scanner; 
  
    public Entretenimiento(String titulo, int audiencia, String empresa,
            double critica, String plataforma,
            ArrayList<String> patrocinadores) {

        this.titulo = titulo;
        this.audiencia = audiencia;
        this.empresa = empresa;
        this.critica = critica;
        this.plataforma = plataforma;
        this.patrocinador = patrocinadores; 
    }
  

  
  public double mostrarCritica(){
      return critica;
  }
  
  public void agregarPatrocinador(String agregarP){
       scanner = new Scanner(System.in);
      System.out.println("Introduzca el nombre del patrocinador que quiera agregar: ");
      agregarP=scanner.nextLine(); 
      patrocinador.add(agregarP); 
      
  }
  
  public void mostrarPatrocinadores(){
      System.out.println("Patrocinadores:");
      System.out.println();
      System.out.println("-------------------------------------------------------------------------");
      for (int i = 0; i < patrocinador.size(); i++) {
System.out.println("Posición " + i + " ? " + patrocinador.get(i));
      }
  }
  
    public void eliminarPatrocinador(int posicion) {
         scanner = new Scanner(System.in);
        if (patrocinador.isEmpty()) {
            System.out.println("No hay patrocinadores para eliminar.");
            return;
        }
        mostrarPatrocinadores();
        System.out.println("Elija el número del patrocinador que desea eliminar:");
         posicion = scanner.nextInt();
        if (posicion >= 0 && posicion < patrocinador.size()) {
            patrocinador.remove(posicion);
            System.out.println("Patrocinador eliminado correctamente.");
        } else {
            System.out.println("Posición no válida.");
        }
        
  }
    @Override
    public String toString() {
        return "Título: " + titulo
                + "\nAudiencia: " + audiencia
                + "\nEmpresa: " + empresa
                + "\nCrítica: " + critica
                + "\nPlataforma: " + plataforma
                + "\nPatrocinadores: " + patrocinador;
    }
}
  




