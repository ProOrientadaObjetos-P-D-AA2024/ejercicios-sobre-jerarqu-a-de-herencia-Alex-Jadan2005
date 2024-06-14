package problema.tres_sistemamensajesmovilesejecutor;

public class ProblemaTres_SistemaMensajesMovilesEjecutor {
    
    public static void main(String[] args) {
        // Crear un SMS y un MMS con nombres adicionales
        Problema_3_SMS smsConNombres = new Problema_3_SMS("095478421", "094518710", "Pepe", "Rosa", "Buenos dias,le envio la foto.");
        Problema_3_MMS mmsConNombres = new Problema_3_MMS("096314512", "098451267", "Margarita", "Blanca", "Problema-3_SisMensaje.png");

        // Enviar y visualizar los mensajes con nombres adicionales
        smsConNombres.enviarMensaje();
        smsConNombres.visualizarMensaje();

        mmsConNombres.enviarMensaje();
        mmsConNombres.visualizarMensaje();
    }
}