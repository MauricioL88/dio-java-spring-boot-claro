package desafios.pooiphone.equipamentos.tocadormusical;

public class Ipod implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando a musica no Ipod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica no Ipod");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica + " no Ipod");
    }

}
