/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IGU;

/**
 *
 * @author USUARIO
 */
public class Leon extends Felino {
    private int numManada;
    private double potenciaRugido;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, 
                double garras, int velocidad, int numManada, double potencia) {
        super(habitat, altura, largo, peso, nombreCientifico, garras, velocidad);
        this.numManada = numManada;
        this.potenciaRugido = potencia;
    }
    @Override
    public String comer() {
        return "El León caza en su manada de " + numManada + " individuos en el hábitat: " + habitat;
    }
    // Implementar los otros 3 métodos de forma similar...
    @Override public String dormir() { return "El león duerme bajo un árbol."; }
    @Override public String correr() { return "El león corre a " + velocidad + " km/h."; }
    @Override public String comunicarse() { return "Ruge con " + potenciaRugido + " decibeles."; }
}
