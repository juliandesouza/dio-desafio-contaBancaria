import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
        
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);        
        
        int numeroAgencia;
        Double saldo;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        numeroAgencia = Integer.valueOf(sc.nextInt());
        System.out.println("Por favor, digite o seu saldo!");
        saldo = Double.valueOf(sc.nextDouble());
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Por favor, digite a sua agência!");
        String agencia = sc2.nextLine();

        sc.close();
        sc2.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroAgencia);
        System.out.println("E seu saldo de R$ " + saldo + " já está disponível para saque!");
        System.out.println("Tenha um ótimo dia!");
        
        
        

    }

}
