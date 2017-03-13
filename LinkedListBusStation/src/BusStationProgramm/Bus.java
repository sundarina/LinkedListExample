package BusStationProgramm;

/**
 * Created by sun on 07.03.17.
 */
public class Bus {
    private String fio;
    private int road;
    private int number;

    public Bus(String fio, int road, int number) {
        this.fio = fio;
        this.road = road;
        this.number = number;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getRoad() {
        return road;
    }

    public void setRoad(int road) {
        this.road = road;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "fio = '" + fio + '\'' +
                ", road = " + road +
                ", number = " + number +
                '}';
    }
}
