
package problema.tres_sistemamensajesmovilesejecutor;

class Problema_3_SMS extends Problema_3_MensajeMov {
    private String texto_mensaje;

    public Problema_3_SMS(String num_remit, String num_dest, String nombre_remit, String nombre_dest, String texto_mensaje) {
        super(num_remit, num_dest, nombre_remit, nombre_dest);
        this.texto_mensaje = texto_mensaje;
    }

    public String getTextoMensaje() {
        return texto_mensaje;
    }

    public void setTextoMensaje(String texto_mensaje) {
        this.texto_mensaje = texto_mensaje;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("         ' Enviar Mensaje ' ");
        separador();
        System.out.println("   -Mensaje destinado a: " + nombre_dest);
        System.out.println("   -Número del receptor: " + num_dest);
        System.out.println("   -De parte de: " + nombre_remit);
        System.out.println("   -Número del emisor: " + num_remit);
        System.out.println("   -SMS:" + texto_mensaje);
        separador();
    }

    @Override
    public void visualizarMensaje() {
        System.out.println("     ' Revisar mensaje enviado '");
        separador();
        System.out.println("    -Mensaje de: " + nombre_remit);
        System.out.println("    -Número del emisor: " + num_remit);
        System.out.println("    -Para: " + nombre_dest);
        System.out.println("    -Número del receptor: " + num_dest);
        System.out.println("    -SMS:" + texto_mensaje);
        System.out.println("-------------------------------------------");
    }
    
    public static void separador(){
        System.out.println(" ====================================");
    }
}