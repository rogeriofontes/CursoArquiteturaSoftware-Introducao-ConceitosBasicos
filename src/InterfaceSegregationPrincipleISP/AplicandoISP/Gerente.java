package InterfaceSegregationPrincipleISP.AplicandoISP;

public class Gerente implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Gerente trabalhando");
    }
}
