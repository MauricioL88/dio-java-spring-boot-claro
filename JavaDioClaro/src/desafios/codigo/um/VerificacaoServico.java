/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
    Descrição
    Uma concessionária de telecomunicações oferece quatro tipos de serviços:
    telefonia móvel, telefonia fixa, banda larga e TV por assinatura.
    Para facilitar o atendimento ao cliente, é necessário implementar um
    programa que verifique se um cliente específico contratou um determinado
    serviço. Por exemplo, quando um cliente liga para a central de atendimento
    e menciona um serviço, o atendente deve ser capaz de rapidamente verificar
    se esse serviço está contratado pelo cliente.

    Entrada
    A entrada deve receber duas linhas. A primeira linha contém o nome do
    serviço a ser verificado (por exemplo, "movel", "fixa", "banda larga",
    "tv"). A segunda linha contém o nome do cliente seguido pelos serviços que
    ele contratou, todos separados por vírgulas (por exemplo, "Alice,movel,
    fixa").

    Saída
    Deverá retornar "Sim" se o cliente contratou o serviço e "Nao" caso contrário.

    Exemplos:
    - entrada:
        movel
        Alice,movel,fixa
    - saida:
        Sim
    
    - entrada:
        fixa
        Bob,movel,tv
    - saida:
        Sim

    - entrada:
        tv
        Carol,movel,fixa,tv
    - saida:
        Sim
*/

package desafios.codigo.um;

import java.util.Scanner;

public class VerificacaoServico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        for(int i = 1; i < partes.length; i++) {
            if(partes[i].equals(servico)) {
                contratado = true;
            }            
        }
        
        if(contratado) {
            System.out.println("Sim");
        }else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}
