package hw24;

import exam.City;
import exam.Village;

public class Main {
    public static void main(String[] args) {
        City1 city1= new City1("Bishkek");
        city1.population();
        city1.supervisername();
        City2 city2= new City2("Almata");
        city2.supervisername();
        city2.population();
        City3 city3= new City3("Ташкент");
        city3.supervisername();
        city3.population();
        Township township= new Township("Tokmok",5678);
        township.population();
        township.supervisernameTownship();
        Township2 township2=new Township2("kara kulja",798);
        township2.supervisernameTownship();



    }
}
