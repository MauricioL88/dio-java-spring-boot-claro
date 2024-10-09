package orientacaoobjeto.tipoenum;

// Criando um Enum de Estado do Brasil para ser usado em qualquer a aplicação.
public enum EstadoBrasileiro {
    // Lista de estados com os dados definidos, adição de dados é manualmente.
    SAO_PAULO ("SP", "Sao Paulo"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piaui"),
    MARANHAO ("MA", "Maranhao"),
    BAHIA ("BA","Bahia");
    
    // Atributos para vínculo dos dados
    private String nome;
    private String sigla;
    
    // Construtor privado para associar os dados de forma imediata aos métodos
    private EstadoBrasileiro(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSigla() {
        return this.sigla;
    }
    
    public String getNomeMaiusculo() {
        return this.nome.toUpperCase();
    }    
}
