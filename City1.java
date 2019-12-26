package hw24;

public class City1 extends  AbstractLocality{
    public City1(String name) {
        super(name);
    }

    public City1(int countPopulation) {
        super(countPopulation);
    }

    @Override
    public void population() {

    }

    @Override
    public void supervisername() {
        System.out.println("Руководитель первого города Ахмат");
    }


}





