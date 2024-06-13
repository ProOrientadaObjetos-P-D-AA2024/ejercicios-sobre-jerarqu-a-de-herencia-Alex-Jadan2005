
package problema6_sistema_banco;
public class Cheque extends Cliente {
    protected double dinero_inicial;
    protected double gastos;

    public Cheque(int numero_cuenta, String nombre,double dinero_inicial, double gastos) {
        super(numero_cuenta, nombre);
        this.dinero_inicial = dinero_inicial;
        this.gastos = gastos;
    }

    public double getDinero_inicial() {
        return dinero_inicial;
    }

    public void setDinero_inicial(double dinero_inicial) {
        this.dinero_inicial = dinero_inicial;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
    
    public String toString(){
        return "\n=============================\nNumero de cuenta: "+numero_cuenta+"\nNombre: "+nombre+"\nDeposito: "+dinero_inicial+"\nGastos: "+gastos+"\nBalance: "+balance;
    }
    
}
