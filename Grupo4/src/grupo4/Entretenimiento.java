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
public class Entretenimiento {
  private String titulo; 
  private int audiencia; 
  private String empresa; 
  private double critica; 
  private String plataforma; 
  private ArrayList<String>patrocinador;
  
  public Entretenimiento(String titulo, int audiencia, String empresa, double critica, String plataforma){
      this.titulo=titulo; 
      this.audiencia=audiencia; 
      this.empresa=empresa;
      this.critica=critica; 
      this.plataforma=plataforma; 
      this.patrocinador=new ArrayList<>(); 
  }
}




