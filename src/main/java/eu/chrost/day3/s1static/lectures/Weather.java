package eu.chrost.day3.s1static.lectures;

//ta klasa jest spoza pakietu java.lang wiec musi byc zaimportowana
import java.util.Random;

public class Weather {
    private static Weather instance = new Weather();

    private int temperature;

    public static Weather getInstance() {
        return instance;
    }

    public int getTemperature() {
        return temperature;
    }

    //prywatny konstruktor aby zablokowac tworzenie obiektow z zewnatrz klasy
    private Weather() {
        //this.temperature = (int) (Math.random() * 100);
        this.temperature = new Random().nextInt(100);
    }
}
