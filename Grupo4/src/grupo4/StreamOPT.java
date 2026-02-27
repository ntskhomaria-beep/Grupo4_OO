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
        System.out.println("Bienvenido! Aqui podras ver varias peliculas, series y estreams de tus personas y "
                + "actores favorito.");
        System.out.println();
        System.out.println("1. Iniciar Sesion");
        System.out.println("2. Peliculas");
        System.out.println("3. Series");
        System.out.println("4. Streams");
        Scanner entrar = new Scanner(System.in);
        String menu = entrar.nextLine();
        
        switch(menu){
            case "1":
                case "Iniciar sesion":
                case "IniciarSesion":{
                    System.out.println();
                }
            
            case "2":
                case "peliculas":
                case "Peliculas":{
                    System.out.println();
                }
            
            case "3":
                case "Series":
                case "series":{
                    System.out.println();
                }
            
            case "4":
                case "streams":
                case "Streams":{
                    System.out.println();
                }
        }
    }
}
