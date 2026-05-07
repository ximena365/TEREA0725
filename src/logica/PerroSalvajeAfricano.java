/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import logica.Canino;

/**
 *
 * @author USUARIO
 */
public class PerroSalvajeAfricano extends Canino {
    private int fuerzaMordida;

    public PerroSalvajeAfricano(String habitat, double altura, double largo, double peso, String nombreCientifico, 
                                String color, double tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() { return fuerzaMordida; }

    @Override
    public String comer() {
        return "El perro salvaje de color " + color + " devora su presa rápidamente gracias a su mordida de " + fuerzaMordida + " PSI.";
    }

    @Override
    public String dormir() {
        return "Este canino de " + peso + " kg duerme en madrigueras subterráneas en " + habitat + ".";
    }

    @Override
    public String correr() {
        return "El perro salvaje corre de forma coordinada, siendo un maestro de la resistencia.";
    }

    @Override
    public String comunicarse() {
        return "Se comunica con sonidos agudos y chillidos, usando sus colmillos de " + tamanoColmillos + " cm para defenderse.";
    }
}
