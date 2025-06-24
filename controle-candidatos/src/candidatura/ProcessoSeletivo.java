package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }

    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" , "MONICA", "FABRICIO", "MIRELA", "DANIELA"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou RS%.2f \n", candidato, salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.printf("O candidato %s foi selecionado para a vaga \n", candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativas = 0;
        boolean atendeu = false;
        while (tentativas <= 3 && !atendeu) {
            if (atendido()){
                System.out.printf("%s atendeu \n", candidato);
                return;
            }
            tentativas++;
        }
        System.out.printf("Sem contato com %s\n", candidato);
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidados...");
        for (String candidato : candidatos) {
            System.out.printf("Candidato %s \n", candidato);
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static boolean atendido(){
        return new Random().nextInt(3) == 1;
    }
}
