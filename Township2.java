package hw24;

public class Township2 extends AbstractVillage {
    public Township2(String name, int populationCount) {
        super(name, );
    }

    @Override
    public void supervisernameTownship() {
        System.out.println("Руководитель второго села Эрбол Эсенкалыков");

    }

    @Override
    public void population() {
        System.out.println("население составляет 30000человек");
    }
}
