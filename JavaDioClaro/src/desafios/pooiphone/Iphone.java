package desafios.pooiphone;

import desafios.pooiphone.equipamentos.browser.NavegadorInternet;
import desafios.pooiphone.equipamentos.telefone.Telefone;
import desafios.pooiphone.equipamentos.tocadormusical.ReprodutorMusical;

public class Iphone implements NavegadorInternet, Telefone, ReprodutorMusical {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina https://" + url + " no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina no Iphone");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero + " atraves de um Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligacao atraves do Iphone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Acessando o correio de voz atraves do Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("A musica esta tocando no Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica no Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica + " no Iphone");
    }

}
