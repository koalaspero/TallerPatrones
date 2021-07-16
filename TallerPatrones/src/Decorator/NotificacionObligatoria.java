package Decorator;

public class NotificacionObligatoria implements Notificador {
	String mensaje;

	@Override
	public void enviarNotificacion(String m) {
		mensaje = m;
		// TODO Envia notificacion por SMS y correo electronico
		
	}
	
}
