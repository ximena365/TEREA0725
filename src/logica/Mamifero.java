/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author USUARIO
 */
public abstract class Mamifero {
    protected String habitat;
    protected double altura, largo, peso;
    protected String nombreCientifico;

    public Mamifero(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }
    
    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();

    public String getHabitat() { return habitat; }
    public double getPeso() { return peso; }
    public String getNombreCientifico() { return nombreCientifico; }
    public double getAltura() { return altura; }
    public double getLargo() { return largo; }
}
