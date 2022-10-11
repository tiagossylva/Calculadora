
public class Calculadora {

	public static void somar(int num1, int num2) {
		int soma = num1 + num2;
		System.out.println("A soma é: "+soma);
	}

	public static void dividir(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("impossivel realizar calculo!! \n");
		}
		else 
		{
			int divide = num1 / num2;
			System.out.println("A divisao é: "+divide);

		}
	}

	public static void multiplicar(int num1, int num2) {
		int multiplica = num1 * num2;
		System.out.println("A multiplicacao é: "+multiplica);
	}

	public static void subtrair(int num1, int num2) {
		int diminui = num1 - num2;
		System.out.println("A subtracao é: "+diminui);
	}
}
