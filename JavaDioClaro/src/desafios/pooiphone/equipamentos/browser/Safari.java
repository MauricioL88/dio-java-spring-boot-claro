package desafios.pooiphone.equipamentos.browser;

public class Safari implements NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina https://" + url + " no Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova pagina no Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina no Safari");
    }

}
