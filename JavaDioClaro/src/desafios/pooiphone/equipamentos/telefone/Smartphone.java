package desafios.pooiphone.equipamentos.telefone;

public class Smartphone implements Telefone {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero + " pelo Smartphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada pelo Smartphone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Acessando o correio de voz pelo Smartphone");
    }

}
