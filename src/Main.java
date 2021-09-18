import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Controle da opção de menu do usuário
        int opcao;
        // Variáveis que receberão instâncias das
        // classes Dvd e Cds
        Dvd dvd;
        Cds cds;
        // Exibindo o menu repetidamente até opcao==0
        while(true) {
            System.out.println(" ");
            System.out.println(" ----------------------------- ");
            System.out.println("Digite 0 para SAIR ou a opção abaixo:");
            System.out.println("1 - Cadastrar DVD    " +
                    "2 - Emprestar DVD    3 - Devolver DVD ");
            System.out.println("4 - Cadastrar CDs    " +
                    "5 - Vender CD        6 - Imprimir CDs");
            System.out.println("Opção: ");

            // Configurar Scanner para leitura da opção
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            System.out.println(" ----------------------------- ");
            System.out.println(" ");
            if(opcao==0) {
                System.exit(0);
            }
            switch (opcao) {
                case 1:
                    dvd = Dvd.getInstance();
                    dvd.cadastrar();
                    break;
                case 2:
                    dvd = Dvd.getInstance();
                    dvd.emprestar();
                    break;
                case 3:
                    dvd = Dvd.getInstance();
                    dvd.devolver();
                    break;
                case 4:
                    cds = Cds.getInstance();
                    cds.cadastrar();
                    break;
                case 5:
                    cds = Cds.getInstance();
                    cds.vender();
                    break;
                case 6:
                    cds = Cds.getInstance();
                    cds.imprimir();
                    break;
            }
        }
    }
}
