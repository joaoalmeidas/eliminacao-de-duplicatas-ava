import java.util.Random;
import java.util.Scanner;

public class Duplicatas {

	public static void main(String[] args) {
		
		int sort, tabela = 0, valor;
		int[] valores = new int[91];
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Valores iniciais: ");
		for(int i = 0; i < 5; i++){
			sort = 10 + random.nextInt(91);
			if(sort != valores[sort-10]){
				valores[sort - 10] = sort;
				System.out.printf("%d ", valores[sort - 10]);
			}
		}
		
		while(1 == 1){
			System.out.println("\n\nValores inseridos:");
			for(int i=0; i < valores.length; i++){
				if(valores[i] != 0){
					System.out.printf("%d ", valores[i]);
				}
			}
			do{
				System.out.printf("\n\nInsira um número entre 10 e 100:");
				valor = input.nextInt();
				if(valor<10 || valor>100){
					System.out.println("Insira um valor válido.");
				}else{
					if(valores[valor-10] == valor){
						System.out.println("Valor já inserido!!!");
					}else{
						valores[valor-10] = valor;
					}
				}
			}while(valor<10 && valor>100);
		
		}

	}

}
