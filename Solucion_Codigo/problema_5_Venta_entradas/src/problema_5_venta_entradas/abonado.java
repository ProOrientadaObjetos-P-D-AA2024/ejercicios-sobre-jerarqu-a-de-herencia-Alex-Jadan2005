
package problema_5_venta_entradas;
public class abonado extends entrada{
    private String zona;
    private double precio;
    private int disponible;
    private int localidades;

    public abonado(String nombre, String apellido, String identificador, String zona,double precio, int disponible,int localidades) {
        super(nombre, apellido, identificador);
        this.zona=zona;
        this.precio = precio;
        this.disponible = disponible;
        this.localidades=localidades;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean Precio(){
        if(zona.equals("Principal")){
            precio=17.5;
            return false;
        }else if(zona.equals("PalcoB")){
            precio=40;
            return false;
        }else if(zona.equals("Central")){
            precio=14;
            return false;
        }else if(zona.equals("Lateral")){
            precio=10;
            return false;
        }else{
            System.out.println("=====================\nNombre de zona INCORRECTO\n=====================");
            return true;
        }
    }

    public int getDisponible() {
        return disponible;
    }

    public boolean Disponible() {
        if(disponible>=localidades){
            System.out.println("=====================\nEsta zona está LLENA\n=====================");
            return true;
        }else{
            return false;
        }
    }

    public int getLocalidades() {
        return localidades;
    }

    public void setLocalidades(int localidades) {
        this.localidades = localidades;
    }
    
    
    
    public String toString(){
        return "\nENTRADA\nNombre: "+nombre+"\nApellido: "+apellido+"\nTipos: Normal"+"\nIdentificador: "+identificador+"\nZona: "+zona+"\nPrecio: $"+precio+"\nDescuento: 15%";
    }
}
