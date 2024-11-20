package proyectoMetodos;

public class MetodosAct3 {

	public static void main(String[] args) {
		System.out.println("Cadena de 20 números aleatorios");
		numerosAleatorios();
	}

	public static void numerosAleatorios() {
		//int numeroRandom =0;
		final int MAXIMO = 20;
		int [] cadenaNumeros = new int [MAXIMO];
		for(int i =0;i<cadenaNumeros.length;i++) {
			int numeroRandom = (int) ((Math.random()*10)+1);
			cadenaNumeros[i]=numeroRandom;
			System.out.println("Posición array "+i+" = "+cadenaNumeros[i]);
		}
	}
}



