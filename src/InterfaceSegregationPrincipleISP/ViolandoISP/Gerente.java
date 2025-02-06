package InterfaceSegregationPrincipleISP.ViolandoISP;

public class Gerente implements Funcionario {

    @Override
    public void trabalhar() {
        System.out.println("Gerente trabalhando");
    }

    @Override
    public void programar() {
        throw new UnsupportedOperationException("Gerente não programa");
    }
}
