
package problema.tres_sistemamensajesmovilesejecutor;
class Problema_3_MensajeMov {
    protected String num_remit;
    protected String num_dest;
    protected String nombre_remit;
    protected String nombre_dest;

    public Problema_3_MensajeMov(String num_remit, String num_dest) {
        this.num_remit = num_remit;
        this.num_dest = num_dest;
    }

    public Problema_3_MensajeMov(String num_remit, String num_dest, String nombre_remit, String nombre_dest) {
        this.num_remit = num_remit;
        this.num_dest = num_dest;
        this.nombre_remit = nombre_remit;
        this.nombre_dest = nombre_dest;
    }

    public String getNumRemit() {
        return num_remit;
    }

    public void setNumRemit(String num_remit) {
        this.num_remit = num_remit;
    }

    public String getNumDest() {
        return num_dest;
    }

    public void setNumDest(String num_dest) {
        this.num_dest = num_dest;
    }

    public String getNombreRemit() {
        return nombre_remit;
    }

    public void setNombreRemit(String nombre_remit) {
        this.nombre_remit = nombre_remit;
    }

    public String getNombreDest() {
        return nombre_dest;
    }

    public void setNombreDest(String nombre_dest) {
        this.nombre_dest = nombre_dest;
    }

    public void enviarMensaje() {
        System.out.println("Enviando mensaje de " + (nombre_remit != null ? nombre_remit : "Anonimo") +
                " a " + (nombre_dest != null ? nombre_dest : "Anonimo"));
    }

    public void visualizarMensaje() {
        System.out.println("Mensaje de " + (nombre_remit != null ? nombre_remit : "Anonimo") +
                " a " + (nombre_dest != null ? nombre_dest : "Anonimo"));
    }
}