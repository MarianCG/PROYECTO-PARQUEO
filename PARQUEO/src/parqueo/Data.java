/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectospaceadmin;

/**
 *
 * @author porto
 */
public class Data {

    public Empleado arrEmpleado[];
    
    public static String matrizS1[][] = {
            {"D", "P", "O", "O"},
            {"O", "O", "O", "O"},
            {"O", "P", "O", "O"},
            {"E", "E", "E", "O"},
            {"P", "O", "O", "D"}
        };
    public static String matrizS2[][] = {
            {"P", "P", "O", "O", "P"},
            {"O", "D", "O", "O", "O"},
            {"O", "P", "O", "O", "O"},
            {"O", "O", "O", "O", "P"},
            {"E", "E", "E", "P", "P"}
        };
    public static String matrizS3[][] = {
            {"P", "P", "O", "O", "P"},
            {"O", "O", "O", "O", "O"},
            {"O", "P", "O", "O", "O"},
            {"O", "O", "O", "O", "P"},
            {"P", "P", "D", "P", "P"},
            {"E", "E", "E", "O", "D"}
        };

    public Data(){
        //Tabla de empleados
        arrEmpleado = new Empleado[5];

        arrEmpleado[0] = new Empleado("Erick", "Portocarrero", 118180881, true, false);
        arrEmpleado[1] = new Empleado("Andres", "Viquez", 12345678, false, true);
        arrEmpleado[2] = new Empleado("Kristel", "Vargas", 208460639, false, false);
        arrEmpleado[3] = new Empleado("David", "Moreno", 98765432, true, true);
        arrEmpleado[4] = new Empleado("Jose", "Apestegui", 118180881, false, false);
        
        
    }

}
