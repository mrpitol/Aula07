import java.util.Scanner;

public class FuncoesSemArgumentos {
	
	public static String nome;
	public static void exibirMensagem() {
	System.out.println("Hoje � um belo dia!");
	}

	public static void exibirSaudacao() {
	System.out.println("Bom dia, " + nome);
	}


	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);

	System.out.println("Digite seu nome");
	nome = leitor.next();

	System.out.println("Mensagem da main antes de chamar a fun��o");
	exibirMensagem();
	System.out.println("Mensagem da main depois de chamar a fun��o");
	exibirSaudacao();
	leitor.close();



	}

}
