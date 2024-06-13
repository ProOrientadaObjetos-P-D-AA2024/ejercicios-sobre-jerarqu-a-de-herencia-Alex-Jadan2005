
package problema6_sistema_banco;
public class Problema6_sistema_banco {
    public static void main(String[] args) {
        // TODO code application logic here
        Cheque c=new Cheque(1666,"Alex",400,60);
        c.calcular(400, c.getGastos());
        System.out.println(c.toString());
        
        //OBJETO 2
        Ahorros a=new Ahorros(1786,"Adri",560,314,3);
        a.calcular(a.getDinero(), a.getSueldo_actual());
        System.out.println(a.toString());
        
        //OBJETO 3
        Platino p=new Platino(1586,"Diego",1200,400);
        p.calcular(p.getDinero(), p.getSueldo_actual());
        System.out.println(p.getSueldo_actual());
        System.out.println(p.toString());
        
    }

}
