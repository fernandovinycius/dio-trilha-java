import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        String informacaoFinal = informacaoFinal(agencia, conta, nome, saldo);

        System.out.println(informacaoFinal);
    }

    public static String informacaoFinal(String agencia, int conta, String nome, double saldo) {
        return "Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
               + agencia + ", conta " + conta + " e seu saldo " + saldo 
               + " já está disponível para saque.";
    }
    
}
