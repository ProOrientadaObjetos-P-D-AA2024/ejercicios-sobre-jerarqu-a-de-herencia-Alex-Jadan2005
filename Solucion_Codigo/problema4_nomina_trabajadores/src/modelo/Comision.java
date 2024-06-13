
package modelo;
public class Comision extends persona {
    private double ventas;
    private int porcentaje;
    private double sueldo_total;

    public Comision(String nombre, String apellido, String direccion, String dni, double ventas) {
        super(nombre, apellido, direccion, dni);
        this.ventas = ventas;
        this.porcentaje = 5;
        this.sueldo_total = 0;
    }

    

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getSueldo_total() {
        return sueldo_total;
    }

    public void calcularSueldo_total() {
        sueldo_total =ventas+(ventas*porcentaje/100);
    }
    
    public String toString(){
        return "=========================================\nNombre: "+nombre+"\nApellido: "+apellido+"\nDireccion: "+direccion+"\nDNI: "+dni+"\nTrabajador: Comision\nVentas: $"+ventas+"\nPorcentaje Fijo: "+porcentaje+"\nSueldo"+sueldo_total;
    }
    
}
