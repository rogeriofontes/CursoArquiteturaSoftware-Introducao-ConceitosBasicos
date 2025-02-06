package LiskovSubstitutionPrincipleLSP.AplicandoLSP;

public class Carro extends Veiculo {

    @Override
    void mover() {
        System.out.println("Dirigindo carro");
    }
}
