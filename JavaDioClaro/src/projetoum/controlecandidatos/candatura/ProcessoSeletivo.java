/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoum.controlecandidatos.candatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Mauricio Lisboa
 */
public class ProcessoSeletivo {

    public static void main(String[] args) {

//        analisarCandidato(1900.0);
//        analisarCandidato(2200.0);
//        analisarCandidato(2000.0);
//        
//        selecaoCandidatos();
//        
//        imprimirSelecionados();
        
        ligandoCandidato();
    }

    // Solução Case 1
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM A CONTRA PROPOSTA!");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS!");
        }
    }

    // Solução Case 2
    // Utilizar uma método que simula o valor pretendido de forma aleatória
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void selecaoCandidatos() {
        double salarioBase = 2000.0;
        // Uma lista de cadidatos
        String[] candidatos = {
            "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO",
            "MIRELA", "DANIELA", "JORGE"
        };

        int candidatosSelecionados = 0;
        for (int i = 0; (candidatosSelecionados < 5 && i < candidatos.length); i++) {
            String candidato = candidatos[i];
            double salarioPretendido = valorPretendido();
            System.out.printf("O candidato %s solicitou o valor de R$ %.2f reais de salario.\n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga.");
                candidatosSelecionados++;
            }
        }
    }

    // Solução do Case 3
    static void imprimirSelecionados() {
        String[] candidatos = {
            "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"
        };
        System.out.println("Imprimindo a lista de candidatos informando os seus indices");

        int i = 1;
        for (String candidato : candidatos) {
            System.out.println("Candidato " + i + " : " + candidato);
            i++;
        }
    }

    // Solução do Case 4
    // Método auxiliar simulando quantidade de tentativas, se o número for igual a 1 é sinal que atendeu.
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO COM O CANDIDATO REALIZADO COM SUCESSO!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato + ", NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA.");
        }
    }

    static void ligandoCandidato() {
        String[] candidatos = {
            "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"
        };

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }
}
