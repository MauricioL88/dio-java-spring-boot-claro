package orientacaoobjeto.tipoenum;

public class SistemaIbge {
    public static void main(String[] args) {
        // Consultando os estado que já foram criados
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getNome()+" - "+e.getSigla());
        }
        
        EstadoBrasileiro piaui = EstadoBrasileiro.PIAUI;
        System.out.println(piaui.getNome());
    }
}
