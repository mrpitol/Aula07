
public class Funcoes {
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
}
