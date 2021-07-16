package Decorator;

public class NotificacionDecorator implements Notificador {
	protected Notificador wrappee;
	
	public NotificacionDecorator(Notificador w) {
		wrappee=w;
		
	};
	
	@Override
	public void enviarNotificacion(String mensaje) {
		
	}
	
	
}
