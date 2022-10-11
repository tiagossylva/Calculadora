import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int continuar;
		do {
			System.out.println("Entre com o primeiro valor: ");
			int num1 = entrada.nextInt();
			System.out.println("Entre com o segundo valor: ");
			int num2 = entrada.nextInt();



			int opc = 0;
			do {
				System.out.println("AGORA SELECIONE UMA OPERACAO: ");
				System.out.println("\n\n[1] SOMA ");
				System.out.println("[2] SUBTRAI ");
				System.out.println("[3] MULTIPLICA ");
				System.out.println("[4] DIVIDE ");
				System.out.println(">> Digite uma opcao: ");


				opc = entrada.nextInt();

				switch(opc) {

				case 1:
					//crlt + 1 extract method
					Calculadora.somar(num1, num2);

					break;
				case 2:
					Calculadora.subtrair(num1, num2);

					break;

				case 3:
					Calculadora.multiplicar(num1, num2);

					break;
				case 4:
					Calculadora.dividir(num1, num2);

					break;

				default:
					System.out.println("Operação invalida!!");

				}

			}while (opc > 4);
			
			System.out.println("deseja continuar: [1] sim [2] não ");
			continuar = entrada.nextInt();
			
		}while(continuar == 1);
		
		System.out.println("Calculadora encerrada!");
		
		entrada.close();

	}

}



