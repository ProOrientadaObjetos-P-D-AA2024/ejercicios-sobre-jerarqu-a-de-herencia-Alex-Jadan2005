
package modelo;
public class jefe extends persona {
    private double sueldo;

    public jefe(String nombre, String apellido, String direccion, String dni, double sueldo) {
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
        return "=========================================\nNombre: "+nombre+"\nApellido: "+apellido+"\nDireccion: "+direccion+"\nDNI: "+dni+"\nTrabajador: Jefe\nSueldo: "+sueldo;
    }
    
}
