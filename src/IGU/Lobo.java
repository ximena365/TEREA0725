/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IGU;

/**
 *
 * @author USUARIO
 */
public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, 
                String color, double tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() { return numCamada; }
    public String getEspecieLobo() { return especieLobo; }

    @Override
    public String comer() {
        return "El lobo " + especieLobo + " de color " + color + " come junto a su camada de " + numCamada + " individuos.";
    }

    @Override
    public String dormir() {
        return "El lobo duerme en las frías cavernas de " + habitat + " protegiendo a su grupo.";
    }

    @Override
    public String correr() {
        return "El lobo corre largas distancias mostrando sus colmillos de " + tamanoColmillos + " cm.";
    }

    @Override
    public String comunicarse() {
        return "El lobo " + especieLobo + " aúlla para reunir a la manada en el hábitat " + habitat + ".";
    }
}
