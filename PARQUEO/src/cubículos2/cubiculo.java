/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cubículos2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.lang.String;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author genni
 */
public class cubiculo {
    private int cantidad_cubiculos;
    private String vector_cubiculos[];
    private String vector_empleados[];
    private String vector_reservas[];
    private String[] hab_traida;
    private habitacion hab_retorno;
    private Integer numero;
    private int pos;
    private String HoraInicio;
    private String HoraFin;
    private String HoraInicioStr;
    private String horaFinStr;
    private Object hora;
    private Object inicio;
    
    private habitacion[] cubiculos;
    
    public cubiculo(int cantidad_cubiculos) {
        this.cantidad_cubiculos = cantidad_cubiculos;
        this.vector_cubiculos = new String[cantidad_cubiculos];
        this.vector_empleados = new String[cantidad_cubiculos];
        this.vector_reservas = new String [cantidad_cubiculos];
        this.hab_traida = new String[cantidad_cubiculos];
        this.cubiculos = new habitacion[cantidad_cubiculos];
        for(int i = 0; i < cantidad_cubiculos; i++){
            cubiculos[i] = new habitacion();
            
        
        }
    
    }

    public int getCantidad_cubiculos() {
        return cantidad_cubiculos;
    }

    public void setCantidad_cubiculos(int cantidad_cubiculos) {
        this.cantidad_cubiculos = cantidad_cubiculos;
    }

    public habitacion getVector_cubiculos(int pos) {
        String hab_traida = vector_cubiculos [pos];
        String vector_cubiculos[] = hab_traida.split(";");
        habitacion hab_retorno = new habitacion();
        hab_retorno.setCodigo(Integer.parseInt(vector_cubiculos[0]));
        hab_retorno.setNombre_cubiculo(vector_cubiculos[1]);
        hab_retorno.setEsta_ocupada(Boolean.valueOf(vector_cubiculos[2]));
        
        return hab_retorno;
    }

    public void setVector_cubiculos(String[] vector_cubiculos) {
        this.vector_cubiculos = vector_cubiculos;
    }

    public empleado getVector_empleados() {
        if (vector_empleados[pos] != null) {
            String empleado_traido = vector_empleados[pos];
            String vector_empleados[] = empleado_traido.split(";");
            empleado empleado_retorno = new empleado(Integer.parseInt(vector_empleados[0]), vector_empleados[1]);
            empleado_retorno.setID(Integer.parseInt(vector_empleados[2]));
            return empleado_retorno;
    
    }else {
            return null;
        
        }
        
        
    }

    public void setVector_empleados(String[] vector_empleados) {
        this.vector_empleados = vector_empleados;
    }

    public reservas getVector_reservas() {
        if (vector_reservas[pos] != null) {
            String reserva_traida = vector_reservas[pos];
            String vector_reservas[] = reserva_traida.split(";");
            reservas reserva_retorno = new reservas(
                Integer.parseInt(vector_reservas[0]),  // Hora de inicio
                Integer.parseInt(vector_reservas[1])   // Hora de fin
            );
            return reserva_retorno;
        } else {
            return null; 
        }
    }

    public void setVector_reservas(String[] vector_reservas) {
        this.vector_reservas = vector_reservas;
    }
    public Boolean reservaCubiculo(int posicion) throws ParseException {
        if (posicion < 0 || posicion >= cantidad_cubiculos){
            JOptionPane.showMessageDialog(null, "Posición invalida", "Error" , JOptionPane.ERROR_MESSAGE);
            
            
            return false;
        
        }
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String horaInicioStr = JOptionPane.showInputDialog("Ingrese la hora de inicio. Use HH:mm:ss");
        
        if (!validaHora(horaInicioStr)){
             JOptionPane.showMessageDialog(null, "Formato de hora incorrecto. Use HH:mm:ss" , "Error" , JOptionPane.ERROR_MESSAGE);
            return false;
            
        }
        try {
            Date horaInicio = formatoHora.parse(HoraInicioStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(horaInicio);
            calendar.add(Calendar.HOUR, 1);
            
            String horaFin = formatoHora.format(calendar.getTime());
            vector_reservas[posicion]= horaInicioStr + ";" + horaFinStr;
            JOptionPane.showMessageDialog(null, "Reserva realizada de" + horaInicioStr + "a" + horaFinStr);
            return true;                                                          
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error procesando la hora", "Error", JOptionPane.ERROR_MESSAGE);
            return false;       
        }
    }

    private boolean validaHora(String horaInicioStr) {
        String hora = "";
        return hora.matches("//d{2}://d{2}://d{2}");
                
    }
    public boolean existen_cubiculos_disponibles(){
        boolean existe = false;
        for (int i = 0; i < getCantidad_cubiculos(); i++){
            if (getVector_cubiculos(1).getEsta_ocupada()== false){
                existe = true;
                break;
            
            }
        
        }
        return existe;   
    }
    public habitacion buscar_cubiculo(int codigo){
        habitacion habitacion = null;
        for (int i = 0; i < getCantidad_cubiculos(); i++){
            if (getVector_cubiculos(i) != null){
                if (getVector_cubiculos(i).getCodigo()== codigo) {
                    habitacion = getVector_cubiculos(i);
                    break;
                
                }
            
            }
        
        }
        return habitacion;
    
    }
    public void reservar_cubiculo(int ID, int codigo, String horaInicio) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        LocalTime fin = ((LocalTime)inicio).plusHours(1);
        String horaFin = fin.format(formato);
        
        reservas Reservas = new reservas(horaInicio, horaFin, ID, codigo);
        setVectorreservas(codigo - 1, Reservas);
        
        cubiculo cub = buscarCubiculo(codigo);
        cub.setEsta_ocupado(true);
        setVectorCubiculo(codigo - 1, cub);
        
    
    }
    public habitacion getCubiculo(int index){
        if (index >= 0 && < cubiculos.length){
            return cubiculos[index];    
        }
        return null;
    
    }

    private void setVectorreservas(int i, reservas Reservas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private cubiculo buscarCubiculo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setEsta_ocupado(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setVectorCubiculo(int i, cubiculo cub) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
   
}
