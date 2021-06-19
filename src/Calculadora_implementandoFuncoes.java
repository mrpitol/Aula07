import java.util.Scanner;

public class Calculadora_implementandoFuncoes {
		/*Criar as funçoes para soam, subtração, divisão e multiplicação.
		 * opcional - ceriar tambem função para exibir o resultado.
		 * A digitação dos valores deve ser mantida na main
		 */
	public static void exibirResultado(double resultado, String operacao) {
        System.out.println("Para a operação de " + operacao + " o resultado foi " + resultado);
    }
    public static void soma(double a, double b) {
        double resultado;
        System.out.println("\n\nRealizando a soma entre " + a + " e " + b);
        resultado = a + b;
        exibirResultado(resultado, "soma");
    }
    public static void subtracao(double a, double b) {
        double resultado;
        System.out.println("\n\nRealizando a subtracao entre " + a + " e " + b);
        resultado = a - b;
        exibirResultado(resultado, "subtração");
    }
    public static void divisao(double a, double b) {
        if (b!=0) {
            double resultado;
            System.out.println("\n\nRealizando a divisão entre " + a + " e " + b);
            resultado = a / b;
            exibirResultado(resultado, "divisão");
        }else {
            System.out.println("Não é possível dividir por zero!");
        }
    }
    public static void multiplicacao(double a, double b) {
        double resultado;
        System.out.println("\n\nRealizando a multiplicacao entre " + a + " e " + b);
        resultado = a * b;
        exibirResultado(resultado, "multiplicação");
    }
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        double valor1 = 0, valor2=0;
        double soma, subtracao, divisao, multiplicacao;
        int opcao = 0;
        while (opcao!=6) {
            System.out.println("PROGRAMA CALCULADORA");
            System.out.println("Escolha sua opção!");
            System.out.println("1 - Digitar valores");
            System.out.println("2 - Realizar soma");
            System.out.println("3 - Realizar subtração");
            System.out.println("4 - Realizar divisão");
            System.out.println("5 - Realizar multiplicação");
            System.out.println("6 - Sair");
            opcao = leitor.nextInt();
            switch(opcao) {
            case 1:
                System.out.println("\n\nDigite o 1º valor:");
                valor1 = leitor.nextDouble();
                System.out.println("\n\nDigite o 2º valor:");
                valor2 = leitor.nextDouble();
                System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
                break;
            case 2:
                soma(valor1, valor2);
                break;
            case 3:
                subtracao(valor1, valor2);
                break;
            case 4:
                divisao(valor1, valor2);
                break;
            case 5:
                multiplicacao(valor1, valor2);
                break;
            case 6:
                System.out.println("Saindo do sistema");
                break;
            }
        }
        leitor.close();
	}
}
