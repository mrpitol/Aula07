import java.util.Scanner;

public class FuncoesComArgumentos {
	
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeMain;
        System.out.println("Digite seu nome");
        nomeMain = leitor.next();
        String nomes[] = {"Elton", "Felipe", "Ricardo", "Thalita", "Jos�", "Karen", "T�ssia", "Ana"};
        for(int i=0;i<nomes.length;i++) {
            Funcoes.exibirSaudacao(nomes[i]);
        }
        System.out.println("Mensagem da main antes de chamar a fun��o");
        Funcoes.exibirMensagem();
        System.out.println("Mensagem da main depois de chamar a fun��o");
        Funcoes.exibirSaudacao(nomeMain);
        leitor.close();
    }

}
