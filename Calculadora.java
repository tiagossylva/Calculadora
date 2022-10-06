import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
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
				int soma = num1 + num2;
				System.out.println("A soma é: "+soma);

				break;
			case 2:
				int diminui = num1 - num2;
				System.out.println("A subtracao é: "+diminui);

				break;

			case 3:
				int multiplica = num1 * num2;
				System.out.println("A multiplicacao é: "+multiplica);

				break;
			case 4:
				if (num1 < num2) {
					System.out.println("impossivel realizar calculo!! \n");
				}
				else 
				{
					int divide = num1 / num2;
					System.out.println("A divisao é: "+divide);

				}

				break;

			default:
				System.out.println("Operação invalida!!");

			}

		}while (opc  > 4);
		entrada.close();
	}
}


