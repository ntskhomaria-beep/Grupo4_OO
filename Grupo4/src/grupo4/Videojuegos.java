/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4;

import java.util.ArrayList;
import java.util.Random;

public class Videojuegos extends Entretenimiento {

    private String franquicia;
    private String categoria;
    private String clasifiEdad;
    private double costo;
    private boolean microtransacciones;
    Random ale = new Random();
    int num = ale.nextInt(10) + 1;

    public Videojuegos(String titulo, int audiencia, String empresa, String valoracion, String plataforma, ArrayList<String> patrocinadores, String franquicia,
            String categoria, String ClasifiEdad, double costo,
            boolean microtransacciones) {

        super(titulo, audiencia, empresa, costo, plataforma, patrocinadores);
        this.franquicia = franquicia;
        this.categoria = categoria;
        this.clasifiEdad = ClasifiEdad;
        this.costo = costo;
        this.microtransacciones = microtransacciones;
    }

    public String mostrarCategoria() {
        return categoria;
    }

    public boolean mostrarDisponibilidad() {
        return ale.nextInt(11) < 5;
    }

    public double mostrarPrecio() {
        return costo;
    }

    public String mostrarEdad() {
        return clasifiEdad;
    }

    public boolean MostrarMicro() {
        return microtransacciones;
    }

    @Override
    public String toString() {
        return "Franquicia: " + franquicia
                + "\nCategoria: " + categoria
                + "\nClasificacion de edad: " + clasifiEdad
                + "\nPrecio: " + costo
                + "\nMicrotransacciones: " + microtransacciones;
    }
}
