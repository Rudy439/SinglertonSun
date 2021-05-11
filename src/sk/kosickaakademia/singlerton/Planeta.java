package sk.kosickaakademia.singlerton;

public class Planeta {
    private String name;
    private long distance;

    public Planeta(String name, long distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public long getDistance() {
        return distance;
    }
}
