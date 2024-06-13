
package problema6_sistema_banco;
public class Ahorros extends Cliente {
    private double dinero;
    private double gastos;
    private int interes;
    private double sueldo_actual;

    public Ahorros(int numero_cuenta, String nombre,double dinero, double gastos, int interes) {
        super(numero_cuenta, nombre);
        this.dinero = dinero;
        this.gastos = gastos;
        this.interes = interes;
        calcularSueldo();
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public double getSueldo_actual() {
        return sueldo_actual;
    }
    
    public void calcularSueldo() {
        sueldo_actual = dinero-gastos+((dinero-gastos)*(interes/100));
    }
    
    

    
    
    public String toString(){
        return "\n=============================\nNumero de cuenta: "+numero_cuenta+"\nNombre: "+nombre+"\nDeposito: $"+dinero+"\nGastos: $"+gastos+"\nInteres: "+interes+"%\nBalance: $"+balance;
    
    }
    
}
