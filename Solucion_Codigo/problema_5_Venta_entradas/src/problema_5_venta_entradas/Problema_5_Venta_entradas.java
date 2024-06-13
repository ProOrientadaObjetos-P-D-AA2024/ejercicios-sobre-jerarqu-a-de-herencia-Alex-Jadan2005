
package problema_5_venta_entradas;
public class Problema_5_Venta_entradas {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nueva Venta de Entrada:\nZona Principal");
        normal n=new normal("Alex","Jadan","0001","Principal",25,20,200);
        //proceso necesario para validar una entrada
        boolean validar,validar2;
        validar=n.Precio();
        validar2=n.Disponible();
        if(validar!=true){
            if(validar2!=true){
            System.out.println(n.toString());
            }
        }
        
        //OBJETO 2
        System.out.println("\nNueva Venta de Entrada:\nZona Lateral");
        abonado a=new abonado("Alex","Jadan","0002","Lateral",25,100,100);
        validar=a.Precio();
        validar2=a.Disponible();
        if(validar!=true){
            if(validar2!=true){
            System.out.println(a.toString());
            }
        }
        //OBJETO 3
        System.out.println("\nNueva Venta de Entrada:\nZona Lateral");
        reducido r=new reducido("Alex","Jadan","0003","Central",20,100,400);
        validar=r.Precio();
        validar2=r.Disponible();
        if(validar!=true){
            if(validar2!=true){
            System.out.println(r.toString());
            }
        }
        
    }

}
