/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4;

public class Suscripcion {

    private String nombre;
    private double precio;
    private boolean anuncios;
    private boolean permiteComentarios;
    private int limiteStreamsDia;
    private boolean calidad4K;
    private int duracionHoras; //exclusivo para DEMO PLAN 72h

    public Suscripcion(String nombre, double precio, boolean anuncios,boolean permiteComentarios, int limiteStreamsDia, boolean calidad4K, int duracionHoras) {

        this.nombre=nombre;
        this.precio=precio;
        this.anuncios=anuncios;
        this.permiteComentarios=permiteComentarios;
        this.limiteStreamsDia=limiteStreamsDia;
        this.calidad4K=calidad4K;
        this.duracionHoras=duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }
   
    public boolean tieneAnuncios() {
        return anuncios;
    }
    public boolean permiteComentarios() {
        return permiteComentarios;
    }
   
    public int getLimiteStreamsDia() {
        return limiteStreamsDia;
    }
   

    
    public boolean getCalidad4K() {
        return calidad4K;
    }
    
    public double getPrecio() {
    return precio;
}

   
    public void mostrarSuscripcion() {
        System.out.println("Plan: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Anuncios: " + (anuncios ? "Sí" : "No"));
        System.out.println("Comentarios: " + (permiteComentarios ? "Permitidos" : "No permitidos"));
        System.out.println("Límite streams/día: " + limiteStreamsDia);
        System.out.println("Calidad 4K: " + (calidad4K ? "Sí" : "No"));
        if (duracionHoras > 0) {
            System.out.println("Duración: " + duracionHoras + " horas");
        }
}
}