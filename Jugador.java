/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author hp
 */
public class Jugador {
    String nombre;
    char figura;

    public Jugador() {
    }

    public Jugador(String nombre, char figura) 
    {
        this.nombre = nombre;
        this.figura = figura;
    }

    public String getNombre() {
        return nombre;
    }

    public char getFigura() {
        return figura;
    }
    
    public boolean realizarMovimiento(Tablero tablero, int fila, int columna) 
    {
        return tablero.realizarMovimientos(fila, columna, figura);
    }
}
