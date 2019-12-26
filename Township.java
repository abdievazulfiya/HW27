package hw24;

public class Township  extends AbstractVillage {
    public Township(String name, int populationCount) {
        super(name, populationCount);

    }

    @Override
    public void supervisernameTownship() {
        System.out.println("Руководитель села Мырза Кайратов");

    }

    @Override
    public void population() {
        System.out.println("население составляет 500000 человек");
    }
}



