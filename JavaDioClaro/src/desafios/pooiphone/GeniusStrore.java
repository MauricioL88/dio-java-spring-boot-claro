package desafios.pooiphone;

import desafios.pooiphone.equipamentos.tocadormusical.Ipod;
import desafios.pooiphone.equipamentos.tocadormusical.ReprodutorMusical;

public class GeniusStrore {

    public static void main(String[] args) {        
        ReprodutorMusical tocador1 = new Ipod();
        ReprodutorMusical tocador2 = new Iphone();
        
        tocador1.tocar();
        tocador2.tocar();        
    }
}
