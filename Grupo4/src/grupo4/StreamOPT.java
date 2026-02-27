/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4;

import java.util.Scanner;

/**
 *
 * @author E.BEDOYA
 */
public class StreamOPT {
    public static void main(String[] args) {
        System.out.println("Bienvenido! Aqui podras ver varias peliculas, series y estreams de tus personas y actores "
                + "favorito.");
        System.out.println();
        System.out.println("1. Peliculas");
        System.out.println("2. Series");
        System.out.println("3. Streams");
        Scanner entrar = new Scanner(System.in);
        String menu = entrar.nextLine();
        switch(menu){
            case "1":
            case "peliculas":
            case "Peliculas":{
                System.out.println();
            }
            
            case "2":
            case "Series":
            case "series":{
                
            }
            
            case "3":
            case "streams":
            case "Streams":{
                
            }
        }
    }
}
