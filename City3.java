package hw24;

public class City3 extends AbstractLocality {
    public City3(String name) {
        super(name);
    }

    public City3(int countPopulation) {
        super(countPopulation);
    }

    @Override
    public void supervisername() {
        System.out.println("Руководитель третьего города Алтынбек Эсенкалык");
    }

    @Override
    public void population() {

    }
}
