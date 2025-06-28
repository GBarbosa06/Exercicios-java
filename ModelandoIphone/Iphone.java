import java.util.Scanner;


public class Iphone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        do {
            System.out.println("Menu:");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.println("Reprodutor Musical:");
                    System.out.println("1. Tocar");
                    System.out.println("2. Pausar");
                    System.out.println("3. Selecionar Música");
                    System.out.print("Escolha uma ação: ");
                    int musicOption = scanner.nextInt();
                    scanner.nextLine();
                    switch (musicOption) {
                        case 1:
                            reprodutorMusical.tocar();
                            break;
                        case 2:
                            reprodutorMusical.pausar();
                            break;
                        case 3:
                            System.out.print("Digite o nome da música: ");
                            String musica = scanner.nextLine();
                            reprodutorMusical.selecionarMusica(musica);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Aparelho Telefônico:");
                    System.out.println("1. Ligar");
                    System.out.println("2. Atender");
                    System.out.println("3. Iniciar Correio de Voz");
                    System.out.print("Escolha uma ação: ");
                    int phoneOption = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    switch (phoneOption) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                             break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 3:
                    System.out.println("Navegador na Internet:");
                    System.out.println("1. Exibir Página");
                    System.out.println("2. Adicionar Nova Aba");
                    System.out.println("3. Atualizar Página");
                    System.out.print("Escolha uma ação: ");
                    int browserOption = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    switch (browserOption) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (option != 0);

        scanner.close();
    }
}
