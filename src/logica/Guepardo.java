/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import logica.Felino;

/**
 *
 * @author USUARIO
 */
public class Guepardo extends Felino {
    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, 
                    double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo utiliza su visión aguda en " + habitat + " para cazar gacelas antes de comer.";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme alerta para evitar a otros depredadores más grandes.";
    }

    @Override
    public String correr() {
        return "Es el mamífero más veloz del mundo, corriendo a " + velocidad + " km/h sobre sus garras de " + tamanoGarras + " cm.";
    }

    @Override
    public String comunicarse() {
        return "El guepardo (nombre científico: " + nombreCientifico + ") se comunica mediante gorjeos similares a los de un ave.";
    }
}
