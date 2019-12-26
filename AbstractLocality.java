package hw24;

abstract class AbstractLocality {
    private String name;
    private int countPopulation;

    public AbstractLocality(String name) {
        this.name = name;
    }

    public AbstractLocality(int countPopulation) {
        this.countPopulation = countPopulation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public abstract void supervisername();
     public abstract void population();

}
