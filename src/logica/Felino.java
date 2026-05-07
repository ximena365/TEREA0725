/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author USUARIO
 */
public abstract class Felino extends Mamifero {
    // Atributos específicos requeridos
    protected double tamanoGarras;
    protected int velocidad;
    
    public Felino(String habitat, double altura, double largo, double peso, 
                  String nombreCientifico, double tamanoGarras, int velocidad) {
        
        
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }
    
    public double getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
