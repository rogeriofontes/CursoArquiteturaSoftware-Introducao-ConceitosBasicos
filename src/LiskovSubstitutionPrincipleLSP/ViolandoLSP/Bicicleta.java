package LiskovSubstitutionPrincipleLSP.ViolandoLSP;

public class Bicicleta extends Veiculo {
    @Override
    public void dirigir() {
        throw new UnsupportedOperationException("Bicicletas não podem ser dirigidas da mesma forma!");
    }
}
