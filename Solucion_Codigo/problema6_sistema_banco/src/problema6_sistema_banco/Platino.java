
package problema6_sistema_banco;
public class Platino extends Cliente {
    private double dinero;
    private double sueldo_actual;
    private double gastos;

    public Platino( int numero_cuenta, String nombre,double dinero,double gastos) {
        super(numero_cuenta, nombre);
        this.dinero = dinero;
        this.gastos= gastos;
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

    public double getSueldo_actual() {
        return sueldo_actual;
    }
    
    public void calcularSueldo() {
        sueldo_actual = dinero-gastos+((dinero-gastos)*0.1);
    }
    
    public String toString(){
        return "\n=============================\nNumero de cuenta: "+numero_cuenta+"\nNombre: "+nombre+"\nDeposito: $"+dinero+"\nGastos: $"+gastos+"\nInteres: 5"+"%\nBalance: $"+balance;
    }
    
    
    
}
