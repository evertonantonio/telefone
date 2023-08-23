package telefoneSistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Telefone iphone = new Telefone();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao iPhone Simulator!");
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Aparelho Telefônico");
            System.out.println("3 - Navegador na Internet");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            int option = sc.nextInt();
            sc.nextLine(); // Limpar o buffer

            switch (option) {
                case 0:
                    System.out.println("Saindo do simulador...");
                    sc.close();
                    return;
                case 1:
                    System.out.print("Digite o nome da música: ");
                    String musica = sc.nextLine();
                    iphone.selecionarMusica(musica);
                    iphone.tocar();
                    iphone.pausar();
                    break;
                case 2:
                    System.out.print("Digite o número para ligar: ");
                    String numero = sc.nextLine();
                    iphone.ligar(numero);
                    iphone.atender();
                    iphone.iniciarCorreioVoz();
                    break;
                case 3:
                    System.out.print("Digite a URL da página: ");
                    String url = sc.nextLine();
                    iphone.adicionarNovaAba(url);
                    iphone.exibirPagina(url);
                    iphone.atualizarPagina();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
