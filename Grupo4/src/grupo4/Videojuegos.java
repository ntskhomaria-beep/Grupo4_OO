/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4;
import java.time.LocalDate;
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
    
    public Videojuegos(String titulo, int audiencia, String empresa, String valoracion, String plataforma, Patrocinador patrocinador, String franquicia, 
            String categoria, boolean online, boolean competitivo, String advertencia, String ClasifiEdad, double costo, boolean subscripcion, LocalDate UltimaAct,
            int DuracionAprox, boolean microtransacciones){
        
        super();
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
        if () {
            return true;
        } else {
            return false;
        }
    }
    public double mostrarPrecio(){
        return costo;
    }
}
