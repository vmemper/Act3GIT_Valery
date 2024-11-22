package proyectoMetodos;

import java.util.Scanner;

public class MetodosAct3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cadena de 20 números aleatorios");
		numerosAleatorios();
		
		int valor1=0;
		int valor2=0;
		int valor3=0;
		int valorInicial=0;
		
		do {
			System.out.println("Introuduce 3 valores por teclado");
			System.out.println("Valor 1");
			valor1 = Integer.parseInt(sc.nextLine());
			System.out.println("Valor 2");
			valor2 = Integer.parseInt(sc.nextLine());
			System.out.println("Valor 3");
			valor3 = Integer.parseInt(sc.nextLine());
		
			while (valor1 + 7 <= valor2) {
                valor1 += 7;
                
                if(valorInicial==0) {
                valorInicial=valor1;
                }
                int valorAnterior=valor1-7;
                System.out.println(valorAnterior +" + 7 = "+ valor1);
            }	
			 
			if(valor3>valorInicial && valor3<valor1) {
				System.out.println("El valor3 está entre el valor1 y valor2");
			}
			
			System.out.println("Para realizar la operacion entre los valores tiene que haber mímino una diferencia de 7");
		} while(valor1<=valor2);
		
		sc.close();
	}

	public static void numerosAleatorios() {
		final int MAXIMO = 30; //Cambio 20 por 30
		int [] cadenaNumeros = new int [MAXIMO];
		for(int i =0;i<cadenaNumeros.length;i++) {
			int numeroRandom = (int) ((Math.random()*10)+1);
			cadenaNumeros[i]=numeroRandom;
			System.out.println("Posición array "+i+" = "+cadenaNumeros[i]);
		}
	}
}




