package InterfaceSegregationPrincipleISP.AplicandoISP;

public class Engenheiro implements Trabalhador, Programador {
    @Override
    public void trabalhar() {
        System.out.println("Engenheiro trabalhando...");
    }

    @Override
    public void programar() {
        System.out.println("Engenheiro programando...");
    }
}
