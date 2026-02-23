/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author E.BEDOYA
 */
public class Videojuegos extends Entretenimiento{
    private String franquicia;
    private String categoria;
    private boolean online;
    private boolean competitivo;
    private String advertencia;
    private String ClasifiEdad;
    private double costo;
    private boolean subscripcion;
    private LocalDate ultimaAct;
    private int DuracionAprox;
    private boolean microtransacciones;
    Random ale = new Random();
    int num = ale.nextInt(1,11);
    
    public Videojuegos(String titulo, int audiencia, String empresa, String valoracion, String plataforma, ArrayList<String> patrocinadores, String franquicia, 
            String categoria, boolean online, boolean competitivo, String advertencia, String ClasifiEdad, double costo, boolean subscripcion, LocalDate UltimaAct,
            int DuracionAprox, boolean microtransacciones){
        
        super(titulo, audiencia, empresa, costo, plataforma);
        this.franquicia=franquicia;
        this.categoria=categoria;
        this.online=online;
        this.competitivo=competitivo;
        this.advertencia=advertencia;
        this.ClasifiEdad=ClasifiEdad;
        this.costo=costo;
        this.subscripcion=subscripcion;
        this.ultimaAct=UltimaAct;
        this.DuracionAprox=DuracionAprox;
        this.microtransacciones=microtransacciones;
    }
    
    public String mostrarCategoria(){
        return categoria;
    }
    public boolean mostrarDisponibilidad(){
        if (num <5) {
            return true;
        } else {
            return false;
        }
    }
    public double mostrarPrecio(){
        return costo;
    }
    public LocalDate mostrarAct(){
        return ultimaAct;
    }
    public boolean mostrarOnline(){
        return online;
    }
    public boolean mostrarCompetitivo(){
        return competitivo;
    }
    public String mostrarEdad(){
        return ClasifiEdad;
    }
    public boolean mostrarSubscrip(){
        return subscripcion;
    }
    public int mostrarDuracion(){
        return DuracionAprox;
    }
    public boolean MostrarMicro(){
        return microtransacciones;
    }
    
    @Override
    public String toString(){
        return "Franquincia: " + franquicia + "\nCategoria: " + categoria + "\nOnline: " + online + "\nComptetitivo: " + competitivo 
                + "\nAdvertencia: " + advertencia + "\nClasificacion de edad: " + ClasifiEdad + "\nPrecio: " + costo + "\nSubscripcion: " 
                + subscripcion + "\nUltima actualizacion: " + ultimaAct + "\nDuracion edtimada: " + DuracionAprox + "\nMicrotrasacciones: " + microtransacciones;
    }
}
