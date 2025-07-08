import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        var sc= new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome!");
        var Nome = sc.next(); 
        System.out.println("Por favor, digite o número da Agência!");
        var Agencia = sc.nextInt();
        System.out.println("Por favor, digite o número da Conta Corrente!");
        var ContaCorrente = sc.nextInt();
        System.out.println("Por favor, digite seu Saldo!");
        var Saldo = sc.nextFloat();
        System.out.printf("Olá %s!\n Obrigado por criar uma conta em nosso banco, sua agência é %s, conta corrente %s.\n Seu saldo é %s, e já está disponível para saque! \n", Nome, Agencia, ContaCorrente, Saldo);
    }
}
