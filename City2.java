package hw24;

public class City2 extends AbstractLocality {
    public City2(String name) {
        super(name);
    }

    public City2(int countPopulation) {
        super(countPopulation);
    }



    @Override
    public void supervisername() {
        System.out.println("Руководитель второго города Рая Ахматбекова");
    }

    @Override
    public void population() {

    }
}

