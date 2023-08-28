/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author hp
 */

public class Tablero {
    
    public char[][] tablero;

    public Tablero() {
        
        tablero = new char[3][3];
        
        for (int x = 0; x < 3; x++) 
        {
            for (int y = 0; y < 3; y++) 
            {
                tablero[x][y] = ' ';
            }
        }
        
    }
    public void mostrarTablero() {
        
        for (int x = 0; x < 3; x++) 
        {
            for (int y = 0; y < 3; y++) 
            {
                System.out.print(tablero[x][y]);
                
                if (y < 2) 
                {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (x < 2) 
            {
                System.out.println("---------");
            }
        }
    }
    public boolean sinEspacio() {
        for (int x = 0; x < 3; x++) 
        {
            for (int y = 0; y < 3; y++) 
            {
                if (tablero[x][y] == ' ') 
                {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean realizarMovimientos(int fila, int columna, char jugador) {
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ') 
        {
            return false;
        }
        
        tablero[fila][columna] = jugador;
        return true;
    }
    public boolean buscandoGanador(char jugador) {
        // Comprobaciones de filas, columnas y diagonales
        for (int x = 0; x < 3; x++) 
        {
            if (tablero[x][0] == jugador && tablero[x][1] == jugador && tablero[x][2] == jugador) 
            {
                return true; // Fila
            }
            if (tablero[0][x] == jugador && tablero[1][x] == jugador && tablero[2][x] == jugador) 
            {
                return true; // Columna
            }
        }
        
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) 
        {
            return true; // Diagonal principal
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) 
        {
            return true; // Diagonal secundaria
        }
        return false;
    }
}
