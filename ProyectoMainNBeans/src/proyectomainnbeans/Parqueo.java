/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomainnbeans;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Parqueo {
    
    
    
    private char[][] S1;
    private char[][] S2; 
    private char[][] S3;
    
    public Parqueo() {
        S1 = new char[4][5];
        S2 = new char[5][5];
        S3 = new char[6][5];
        
        // Llenar los parqueos
        llenarParqueo(S1, "S1");
        llenarParqueo(S2, "S2"); 
        llenarParqueo(S3, "S3");
    }

    private void llenarParqueo(char[][] parqueo, String nombre) {
        Random random = new Random();
        int filas = parqueo.length;
        int columnas = parqueo[0].length;

        // Poner 3 espacios para discapacitados
        int espaciosDiscapacitados = 0;
        while (espaciosDiscapacitados < 3) {
            int i = random.nextInt(filas);
            int j = random.nextInt(columnas);
            if (parqueo[i][j] == '\0') {
                parqueo[i][j] = 'E';
                espaciosDiscapacitados++;
            }
        }

        // Poner espacios para directores
        int totalEspacios = filas * columnas;
        int espaciosDirectores = (totalEspacios + 9) / 10;
        int contadorDirectores = 0;
        while (contadorDirectores < espaciosDirectores) {
            int i = random.nextInt(filas);
            int j = random.nextInt(columnas);
            if (parqueo[i][j] == '\0') {
                parqueo[i][j] = 'D';
                contadorDirectores++;
            }
        }

        // Llenar espacios restantes
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (parqueo[i][j] == '\0') {
                    parqueo[i][j] = random.nextInt(2) == 0 ? 'P' : 'O';
                }
            }
        }
    }

    public void mostrarNivel(int nivel) {
        char[][] parqueoMostrar;
        String nombreNivel;
        
        switch(nivel) {
            case 1: 
                parqueoMostrar = S1;
                nombreNivel = "S1";
                break;
            case 2:
                parqueoMostrar = S2;
                nombreNivel = "S2";
                break;
            case 3:
                parqueoMostrar = S3;
                nombreNivel = "S3";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nivel inválido");
                return;
        }

        String mensaje = "Parqueo: " + nombreNivel + "\n";
        for (int i = 0; i < parqueoMostrar.length; i++) {
            for (int j = 0; j < parqueoMostrar[0].length; j++) {
                mensaje += " [ " + parqueoMostrar[i][j] + " ] ";
            }
            mensaje += "\n";
        }
        
        JOptionPane.showMessageDialog(null, mensaje, 
            "Distribución del Parqueo", JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }
}
    
    


