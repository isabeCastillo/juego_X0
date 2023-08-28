/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegox0cp21026;

import CLASES.Jugador;
import CLASES.Tablero;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class X_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero();
        int fila = 0, columna = 0;
        
        String nombreX,nombreO;
        
        System.out.println("Jugar X 0 en linea");
        System.out.print("Ingresar apodo del Jugador X: ");
        nombreX = sc.nextLine();
        System.out.print("Ingresar apodo del Jugador 0: ");
        nombreO = sc.nextLine();
        
        Jugador jugadorX = new Jugador (nombreX, 'X');
        Jugador jugadorO = new Jugador(nombreO, 'O');
        
        Jugador jugadorActual = jugadorX;
        //Jugador jugadorActua = jugadorO;
        
        while (true) {
            System.out.println("\nTurno de " + jugadorActual.getNombre());
            tablero.mostrarTablero();
            jugadorActual = (jugadorActual == jugadorX) ? jugadorO : jugadorX;

            do {
                System.out.print("Ingrese la fila (0-2): ");
                fila = sc.nextInt();
                System.out.print("Ingrese la columna (0-2): ");
                columna = sc.nextInt();   
            } while (!jugadorActual.realizarMovimiento(tablero, fila, columna));
            if (tablero.buscandoGanador(jugadorActual.getFigura())) 
            {
                System.out.println("\n¡"+jugadorActual.getNombre()+ "Has ganado!");
                tablero.mostrarTablero();
                break;
            } 
            else if (tablero.sinEspacio()) 
            {
               System.out.println("¡Empate!");
                tablero.mostrarTablero();
                break;
            }
            
        }
        
    }   
}
