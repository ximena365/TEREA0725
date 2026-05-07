/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IGU;

/**
 *
 * @author USUARIO
 */
public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, 
                 double tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() { return especieTigre; }

    @Override
    public String comer() {
        return "El tigre " + especieTigre + " caza solitario en " + habitat + " usando sus garras de " + tamanoGarras + " cm.";
    }

    @Override
    public String dormir() {
        return "El tigre de " + peso + " kg duerme profundamente entre la vegetación densa.";
    }

    @Override
    public String correr() {
        return "El tigre corre a " + velocidad + " km/h en distancias cortas para emboscar.";
    }

    @Override
    public String comunicarse() {
        return "El tigre " + especieTigre + " emite un rugido territorial para advertir a otros.";
    }
}
