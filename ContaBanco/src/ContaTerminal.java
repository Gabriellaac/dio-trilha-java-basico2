import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("CONTA BANCÁRIA");
        System.out.println("Por favor, digite o número da Agência: (123-6)");
        System.out.println("Depois aperte ENTER");
        agencia = scan.next();

        System.out.println("Agora digite o número da Conta: (1234)");
        System.out.println("Depois aperte ENTER");
		numero = scan.nextInt();

        System.out.println("Me informe seu nome: ");
        System.out.println("Depois aperte ENTER");
		nomeCliente = scan.next();

        System.out.println("Agora me informa seu saldo atual: ");
        System.out.println("Depois aperte ENTER");
		saldo = scan.nextDouble();

        
        System.out.println("Olá " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque." );

		
    }
}
