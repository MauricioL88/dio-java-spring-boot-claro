/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoum.contador;

import java.util.Scanner;

// 1° Passo: Criar uma exceção personalidada, com uma classe herdada da classe "Exception".

/**
 *
 * @author Mauricio Lisboa
 */
public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e)  {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
	}
		
    }
	
    // 2° Passo: adicionar a exceção personalizada com o "throws" no método e implementar a sua lógica
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parametro tem que ser menor que o segundo");
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o numero: "+(i+1));
        }
    }
}
