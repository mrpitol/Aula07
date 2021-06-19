import java.util.Scanner;

public class Calculadora_implementandoFuncoes {
		/*Criar as fun�oes para soam, subtra��o, divis�o e multiplica��o.
		 * opcional - ceriar tambem fun��o para exibir o resultado.
		 * A digita��o dos valores deve ser mantida na main
		 */
	public static void exibirResultado(double resultado, String operacao) {
        System.out.println("Para a opera��o de " + operacao + " o resultado foi " + resultado);
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
        exibirResultado(resultado, "subtra��o");
    }
    public static void divisao(double a, double b) {
        if (b!=0) {
            double resultado;
            System.out.println("\n\nRealizando a divis�o entre " + a + " e " + b);
            resultado = a / b;
            exibirResultado(resultado, "divis�o");
        }else {
            System.out.println("N�o � poss�vel dividir por zero!");
        }
    }
    public static void multiplicacao(double a, double b) {
        double resultado;
        System.out.println("\n\nRealizando a multiplicacao entre " + a + " e " + b);
        resultado = a * b;
        exibirResultado(resultado, "multiplica��o");
    }
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        double valor1 = 0, valor2=0;
        double soma, subtracao, divisao, multiplicacao;
        int opcao = 0;
        while (opcao!=6) {
            System.out.println("PROGRAMA CALCULADORA");
            System.out.println("Escolha sua op��o!");
            System.out.println("1 - Digitar valores");
            System.out.println("2 - Realizar soma");
            System.out.println("3 - Realizar subtra��o");
            System.out.println("4 - Realizar divis�o");
            System.out.println("5 - Realizar multiplica��o");
            System.out.println("6 - Sair");
            opcao = leitor.nextInt();
            switch(opcao) {
            case 1:
                System.out.println("\n\nDigite o 1� valor:");
                valor1 = leitor.nextDouble();
                System.out.println("\n\nDigite o 2� valor:");
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
