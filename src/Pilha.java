import java.util.Scanner;

public class Pilha {	
	
	public Scanner Leitor = new Scanner(System.in);
	public int[] numeros = new int[10];
	
	public Pilha() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º número:");
			numeros[i] = Leitor.nextInt();
		}
		
		Leitor.close();
	}	

	public void ImprimeDecrescente() {			
		for (int i = 9; i >= 0; i--) {
			System.out.println(numeros[i]);
		}		
	}	
}
