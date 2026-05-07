/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

public abstract class Canino extends Mamifero {
    protected String color;
    protected double tamanoColmillos;

    // El constructor recibe los parámetros de Mamifero + los propios de Canino
    public Canino(String habitat, double altura, double largo, double peso, 
                  String nombreCientifico, String color, double tamanoColmillos) {
        
        // Invocamos al constructor de la clase padre (Mamifero)
        super(habitat, altura, largo, peso, nombreCientifico);
        
        // Inicializamos los atributos específicos de Canino
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    // Métodos Getters
    public String getColor() {
        return color;
    }

    public double getTamanoColmillos() {
        return tamanoColmillos;
    }
}