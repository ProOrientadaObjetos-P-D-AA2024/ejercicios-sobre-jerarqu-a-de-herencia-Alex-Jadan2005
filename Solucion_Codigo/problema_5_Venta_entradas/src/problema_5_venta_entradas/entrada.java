
package problema_5_venta_entradas;
public class entrada {
    protected String nombre;
    protected String apellido;
    protected String identificador;

    public entrada(String nombre, String apellido, String identificador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    
}
