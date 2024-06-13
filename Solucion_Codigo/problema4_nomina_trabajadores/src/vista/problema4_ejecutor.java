
package vista;

import modelo.Horas;
import modelo.jefe;

public class problema4_ejecutor {
    public static void main(String[] args) {
        //OBJETO
        
        jefe j=new jefe("Jhonathan","Serrano","18 de Noviembre","300092346",120000);
        
        System.out.println(j.toString());
        
        Horas h=new Horas("Alex","Jadan","Nueva Granada","3050092331",40,5);
        
        System.out.println(h.toString());
        
    }

}
