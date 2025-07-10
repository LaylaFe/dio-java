import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       String [] Candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
       for (String Candidato: Candidatos) {
        EntrandoemContato(Candidato);
       }
    }

    static void EntrandoemContato(String Candidato) {
        int ToquesRealizados = 1;
        boolean ContinuarTentando = true;
        boolean Atendeu = false;
        do {
            Atendeu = Atender();
            ContinuarTentando = !Atendeu;
            if(ContinuarTentando)
            ToquesRealizados++;
            else
            System.out.println("Contato realizado com sucesso!");
        } while(ContinuarTentando && ToquesRealizados<3);
        if(Atendeu)
            System.out.println("Conseguimos contato com " + Candidato + " na " + ToquesRealizados + " tentativa!");
            else
            System.out.println("Não conseguimos contato com " + Candidato + ", número máximo de tentativas " + ToquesRealizados);

    }
    //Método Auxiliar

    static boolean Atender() {
        return new Random().nextInt(3)==1;
    }

    static void ImprimirSelecionados(){
         String [] Candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

         System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

         for(int indice=0; indice < Candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é " + Candidatos[indice]);
         }
         System.out.println("Forma abreviada de interação for each");

         for(String Candidato: Candidatos){
            System.out.println("O candidato selecionado foi " + Candidato);
         }
    }

    static void SelecaoCandidatos(){
        String [] Candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"}; 
       
        int CandidatosSelecionados = 0;
        int CandidatosAtual = 0;
        double SalarioBase = 2000.0;
        while (CandidatosSelecionados < 5 && CandidatosAtual < Candidatos.length) {
            String Candidato = Candidatos[CandidatosAtual];
            double SalarioPretendido = ValorPretendido();

            System.out.println("O candidato " + Candidato + " Solicitou este valor de salário " + SalarioPretendido);
            if(SalarioBase >+ SalarioPretendido) {
                System.out.println("O candidato " + Candidato + " foi selecionado para a vaga");
                CandidatosSelecionados++;
            }
            CandidatosAtual++;

        }
    }

    static double ValorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void AnalisarCandidato(double SalarioPretendido) {
        double SalarioBase = 2000.0;
        if(SalarioBase > SalarioPretendido){
        System.out.println("Ligar para o Candidato");
        } else if(SalarioBase==SalarioPretendido)
        System.out.println("Ligar para o candidato com contra proposta");
        else {
        System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
