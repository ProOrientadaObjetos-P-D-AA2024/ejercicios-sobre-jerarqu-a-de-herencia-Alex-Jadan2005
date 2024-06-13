
package modelo;
public class fijo_mensual extends persona {
    private double sueldo;

    public fijo_mensual(String nombre, String apellido, String direccion, String dni, double sueldo) {
        super(nombre, apellido, direccion, dni);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public String toString(){
        return "=========================================\nNombre: "+nombre+"\nApellido: "+apellido+"\nDireccion: "+direccion+"\nDNI: "+dni+"\nTrabajador: Fijo Mensual\nSueldo"+sueldo;
    }
    
    
}
