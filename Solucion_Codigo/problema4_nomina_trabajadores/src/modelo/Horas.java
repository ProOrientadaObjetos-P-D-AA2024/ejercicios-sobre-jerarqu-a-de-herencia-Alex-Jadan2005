
package modelo;
public class Horas extends persona {
    
    private double salario_hora;
    private double salario_extra;
    private int horas;
    private int horas_extra;
    private double sueldo;

    public Horas(String nombre, String apellido, String direccion, String dni, int horas, int horas_extra) {
        super(nombre, apellido, direccion, dni);
        this.salario_hora = 10;
        this.salario_extra = 15;
        this.horas = horas;
        this.horas_extra = horas_extra;
        this.sueldo = 0;
    }

    public double getSalario_hora() {
        return salario_hora;
    }

    public void setSalario_hora(double salario_hora) {
        this.salario_hora = salario_hora;
    }

    public double getSalario_extra() {
        return salario_extra;
    }

    public void setSalario_extra(double salario_extra) {
        this.salario_extra = salario_extra;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHoras_extra() {
        return horas_extra;
    }

    public void setHoras_extra(int horas_extra) {
        this.horas_extra = horas_extra;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void calcularSueldo() {
        sueldo=(horas*salario_hora)+(horas_extra*salario_extra);
    }
    
    public String toString(){
        return "=========================================\nNombre: "+nombre+"\nApellido: "+apellido+"\nDireccion: "+direccion+"\nDNI: "+dni+"\nTrabajador: Por horas\nHoras Trabajadas: "+horas+"\nHoras extra: "+horas_extra+"\nSueldo"+sueldo;
    }
    
}
