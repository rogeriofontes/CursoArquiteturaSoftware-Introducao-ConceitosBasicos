package InterfaceSegregationPrincipleISP.ViolandoISP;

public class Bombeiro implements Funcionario {
    @Override
    public void trabalhar() {
        System.out.println("Bombeiro trabalhando");
    }

    @Override
    public void programar() {
        throw new UnsupportedOperationException("Bombeiro não programa");
    }
}
