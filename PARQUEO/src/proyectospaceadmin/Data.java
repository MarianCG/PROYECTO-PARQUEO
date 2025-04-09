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
