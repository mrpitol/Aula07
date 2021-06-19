
public class Funcoes {
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
}
