public class EjecutaEjemploPingPong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaraci�n de dos hilos
		EjemploPingPong p1 = new EjemploPingPong("GOLPE UNO", 30);
		EjemploPingPong p2 = new EjemploPingPong("GOLPE DOS", 10);
		// Alistamiento de los hilos -Activaci�n-
		p1.start();
		p2.start();
		// Espera de dos segundos
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// return;
		}

		p1.interrupt();
		p2.interrupt();
	}

}
