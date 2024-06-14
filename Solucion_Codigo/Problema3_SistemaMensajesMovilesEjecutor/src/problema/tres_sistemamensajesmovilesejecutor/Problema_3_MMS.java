
package problema.tres_sistemamensajesmovilesejecutor;

class Problema_3_MMS extends Problema_3_MensajeMov {
    private String archivo_imagen;

    public Problema_3_MMS(String num_remit, String num_dest, String nombre_remit, String nombre_dest, String archivo_imagen) {
        super(num_remit, num_dest, nombre_remit, nombre_dest);
        this.archivo_imagen = archivo_imagen;
    }

    public String getArchivoImagen() {
        return archivo_imagen;
    }

    public void setArchivoImagen(String archivo_imagen) {
        this.archivo_imagen = archivo_imagen;
    }

    @Override
    public void enviarMensaje() {
        separador();
        System.out.println("          ' Enviar Mensaje ' ");
        separador();
        System.out.println("    -Mensaje destinado a: " + nombre_dest);
        System.out.println("    -Número del receptor: " + num_dest);
        System.out.println("    -De parte de: " + nombre_remit);
        System.out.println("    -Número del emisor: " + num_remit);
        System.out.println("    -MMS:"+archivo_imagen);
        separador();
    }

    @Override
    public void visualizarMensaje() {
        separador();
        System.out.println("     ' Revisar mensaje enviado '");
        separador();
        System.out.println("    -Mensaje de: " + nombre_remit);
        System.out.println("    -Número del emisor: " + num_remit);
        System.out.println("    -Para: " + nombre_dest);
        System.out.println("    -Número del receptor: " + num_dest);
        System.out.println("    -MMS:"+archivo_imagen);
        System.out.println("----------------------------------------");
    }
    
    public static void separador(){
        System.out.println(" ====================================");
    }
}