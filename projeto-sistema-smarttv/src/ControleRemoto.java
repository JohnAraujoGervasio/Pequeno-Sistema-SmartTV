import java.util.Scanner;

public class ControleRemoto {

    // O controle precisa de uma TV para funcionar
    
    private SmartTV tv;
    private Scanner leitor;

    // Construtor: Quando você cria o controle, você aponta ele para uma TV

    public ControleRemoto(SmartTV tvConectada) {
        this.tv = tvConectada;
        this.leitor = new Scanner(System.in);
    }

    public void operar() {
        int opcao = -1;
        while (opcao != 0) {
            exibirMenu();
            try {
                opcao = Integer.parseInt(leitor.nextLine()); // Evita erro de buffer do nextInt
                processarComando(opcao);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números!");
            }
        }
    }

    private void exibirMenu() {
        System.out.println("\n--- CONTROLE REMOTO ---");
        System.out.println("Status: " + (tv.ligada ? "LIGADA" : "DESLIGADA"));
        System.out.println("Canal: " + tv.canal + " | Volume: " + tv.volume);
        System.out.println("1- Power | 2- Vol+ | 3- Vol- | 4- Ch+ | 5- Ch- | 6- Digitar Ch | 0- Sair");
        System.out.print("Comando: ");
    }

    private void processarComando(int opcao) {
        switch (opcao) {
            case 1 -> { if (tv.ligada) tv.desligar(); else tv.ligar(); }
            case 2 -> tv.aumentarVolume();
            case 3 -> tv.diminuirVolume();
            case 4 -> tv.aumentarCanal();
            case 5 -> tv.diminuirCanal();
            case 6 -> {
                System.out.print("Número do canal: ");
                int novoCanal = Integer.parseInt(leitor.nextLine());
                tv.mudarCanal(novoCanal);
            }
            case 0 -> System.out.println("Encerrando...");
            default -> System.out.println("Opção inválida!");
        }
    }
}