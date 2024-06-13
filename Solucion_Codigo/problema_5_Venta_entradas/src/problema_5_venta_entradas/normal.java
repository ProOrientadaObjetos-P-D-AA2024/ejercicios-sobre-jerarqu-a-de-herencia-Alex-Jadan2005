
package problema_5_venta_entradas;
public class normal extends entrada{
    private String zona;
    private double precio;
    private int disponible;
    private int localidades;

    public normal(String nombre, String apellido, String identificador, String zona,double precio, int disponible, int localidades) {
        super(nombre, apellido, identificador);
        this.zona=zona;
        this.precio = precio;
        this.disponible = disponible;
        this.localidades=localidades;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    public double getPrecio() {
        return precio;
    }

    public boolean Precio() {
        if(zona.equals("Principal")){
            precio=25;
            return false;
        }else if(zona.equals("PalcoB")){
            precio=70;
            return false;
        }else if(zona.equals("Central")){
            precio=20;
            return false;
        }else if(zona.equals("Lateral")){
            precio=15.5;
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
        return "\nVENTA DE ENTRADA NORMAL\nNombre: "+nombre+"\nApellido: "+apellido+"\nTipos: Normal"+"\nIdentificador: "+identificador+"\nZona: "+zona+"\nPrecio: $"+precio+"\nDescuento: 0%";
    }
    
    
}
