/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parqueo;

import java.util.Random;
import javax.swing.JOptionPane;

public class PARQUEO {

    public static void main(String[] args) {
        char[][] S1 = new char[4][5];
        char[][] S2 = new char[5][5];
        char[][] S3 = new char[6][5];

        // Llamamos el metodo tres veces para llenar cada parqueo
        llenarParqueo(S1, "S1");
        llenarParqueo(S2, "S2");
        llenarParqueo(S3, "S3");
    }

    public static void llenarParqueo(char[][] parqueo, String nombre) {
        Random random = new Random();
        int filas = parqueo.length; // 5
        int columnas = parqueo[0].length; // 4, 5, 6

        // Poner 3 espacios para discapacitados 
        int espaciosDiscapacitados = 0;
        while (espaciosDiscapacitados < 3) {
            // Obtenemos las filas y columnas (posicion) de una forma random
            int i = random.nextInt(filas);
            int j = random.nextInt(columnas);
            // Por ser valor char que es un tipo primitivo, tenemos que usar \0 para saber si esta vacio, null no funciona 
            if (parqueo[i][j] == '\0') {
                parqueo[i][j] = 'E';
                // Incrementa un digito para alcansar la sifra 3 y salir del loop
                espaciosDiscapacitados++;
            }
        }

        // Poner espacios para directores  para determinar espacios pata directores 
        int totalEspacios = filas * columnas;
        // redondeando hacia arriba 
        int espaciosDirectores = (totalEspacios + 9) / 10;
        int contadorDirectores = 0;
        while (contadorDirectores < espaciosDirectores) {
            int i = random.nextInt(filas);
            int j = random.nextInt(columnas);
            if (parqueo[i][j] == '\0') {
                parqueo[i][j] = 'D';
                // Aumenta para salir del ciclo 
                contadorDirectores++;
            }
        }

        // Llenar los espacios restantes con ocupados y libres 
        String mensaje = "\n";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (parqueo[i][j] == '\0') {
                    int numeroAleatorio = random.nextInt(2);
                    if (numeroAleatorio == 0) {
                        parqueo[i][j] = 'P';
                    } else {
                        parqueo[i][j] = 'O';
                    }
                }
            }
        }

        // Mostrar el parqueo
        javax.swing.JOptionPane.showMessageDialog(null, "Parqueo: " + nombre, "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mensaje += " [ " + parqueo[i][j] + " ] ";
            }
            mensaje += "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Distribución del Parqueo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
}
