
//teste no comentario
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);
        Casa cs = new Casa();
        int opc;
        int opcCor;
        int porta;
        do{
            System.out.println("=======- CASA -=======");
            System.out.println("======================");
            System.out.println(">> ESCOLHA UMA OPÇÃO:");
            System.out.println(" 1 - QUANTAS PORTAS ESTÃO ABERTAS");
            System.out.println(" 2 - ABRIR PORTA");
            System.out.println(" 3 - FECHAR PORTA");
            System.out.println(" 4 - COR DA CASA");
            System.out.println(" 5 - SAIR");
            System.out.println("\n==== STATUS DA CASA ====");
            System.out.print(cs);
            System.out.print("\n\n>> ESCOLHA UMA OPÇÃO: \n");
            System.out.print(">>: ");
            opc = scanNum.nextInt();

            switch (opc){
                case 1:
                    System.out.println("PORTAS ABERTAS: " + cs.quantasPortasEstaoAbertas());
                    break;
                case 2:
                    do {
                        porta = selPorta(scanNum);
                        cs.abrirPorta(porta);
                    } while(porta != 4);
                       break;

                case 3:
                    do {
                        porta = selPorta(scanNum);
                        cs.fecharPorta(porta);
                    } while (porta != 4);
                        break;

                case 4:
                    String nC;
                    do{
                        System.out.println("\n ========= COR =========");
                        System.out.println("COR DA CASA: " + cs.getCorCasa());
                        System.out.println(">> DIGITE A NOVA COR DA CASA: ");
                        System.out.print(">>:   ");

                        nC = scan.nextLine();
                        cs.setCorCasa(nC);
                    }
                    while(!nC.equalsIgnoreCase("sair"));
                        break;
                case 5:
                    System.out.println("> FIM DO PROGRAMA!");
                        break;
                default:
                    System.out.println(">> OPÇÃO INVALIDA!");
                        break;
            }

        }while(opc != 5);
    }



    public static int selPorta( Scanner scanNum) {
        int porta;
        do {
            System.out.println("ESCOLHA UMA PORTA:");
            System.out.println("1 - PORTA 1");
            System.out.println("2 - PORTA 2");
            System.out.println("3 - PORTA 3");
            System.out.println("4 - SAIR");
            porta = scanNum.nextInt();
        } while (porta < 1 || porta > 4);
        return porta;
    }

}