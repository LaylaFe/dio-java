import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner Terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número.");
        int NumeroUm = Terminal.nextInt();

        System.out.println("Digite o segundo número.");
        int NumeroDois = Terminal.nextInt();
    
    try{
        Contar(NumeroUm, NumeroDois);
    } catch (ParametrosInvalidosException e) {
        System.out.println("O segundo número deve ser maior que o primeiro.");
    }
    Terminal.close();
    }

static void Contar (int NumeroUm, int NumeroDois) throws ParametrosInvalidosException {
    if (NumeroUm > NumeroDois){
        throw new ParametrosInvalidosException();
    }
    int Contagem = NumeroDois - NumeroUm;

    for (int i = 1; i <= Contagem; i++) {
        System.out.println("Imprimindo o número " + i);
    }
}
}

