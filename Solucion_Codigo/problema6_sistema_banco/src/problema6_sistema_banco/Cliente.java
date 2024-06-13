
package problema6_sistema_banco;
public class Cliente {
    protected int numero_cuenta;
    protected String nombre;
    protected double balance;

    public Cliente(int numero_cuenta, String nombre) {
        this.numero_cuenta = numero_cuenta;
        this.nombre = nombre;
        this.balance = 0;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void calcular(double depositos,double retiros) {
        balance = depositos-retiros;
    }
    
    public void depositar(double n){
        balance=balance+n;
    }
    
    public void retirar(double n){
        balance=balance-n;
    }
    
}
