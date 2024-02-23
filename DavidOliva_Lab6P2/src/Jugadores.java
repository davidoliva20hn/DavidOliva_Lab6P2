/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Jugadores {

    private String Nombre;
    private int Edad;
    private String posición;

    public Jugadores() {
    }

    public Jugadores(String Nombre, int Edad, String posición) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.posición = posición;
    }

    public Jugadores(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    @Override
    public String toString() {
        return Nombre ;
    }
    
}
