package InterfaceSegregationPrincipleISP.ViolandoISP;

public class Engenheiro implements Funcionario {
    @Override
    public void trabalhar() {
        System.out.println("Engenheiro trabalhando...");
    }

    @Override
    public void programar() {
        System.out.println("Engenheiro programando...");
    }
}
