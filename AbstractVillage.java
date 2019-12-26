package hw24;

abstract  class AbstractVillage extends AbstractLocality {
    private String name;
    private int populationCount;


    public AbstractVillage(String name, String name1, int populationCount) {
        super(name);
        this.name = name1;
        this.populationCount = populationCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulationCount() {
        return populationCount;
    }

    public void setPopulationCount(int populationCount) {
        this.populationCount = populationCount;
    }

    public abstract void SupervisernameTownship();
}

