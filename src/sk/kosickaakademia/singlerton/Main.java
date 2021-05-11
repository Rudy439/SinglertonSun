package sk.kosickaakademia.singlerton;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getInstance();
        Planeta earth = new Planeta ( "EARTH", 1496000000l);
        Planeta uran = new Planeta ("URAN",2871000000000l);
        Planeta saturn = new Planeta ("Saturn",1434000000000l);

        sun.addPlaneta(EARTH);
        sun.addPlaneta(URAN);
        sun.addPlaneta(SATURN);

            }
}
