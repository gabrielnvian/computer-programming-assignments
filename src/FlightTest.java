public class FlightTest {
    public static void main(String[] args) {
        Airplane air1, air2;

        air1 = new Airplane("US Air", "Boston", "Los Angeles", 347, 150);
        air2 = new Airplane("Delta", "Philadelphia", "London", 212, 164);

        System.out.println(air1);
        System.out.println(air2);

        air1.setNumberOfPassengers(air1.getNumberOfPassengers() + 10);
        air2.setNumberOfPassengers(air2.getNumberOfPassengers() - 1);

        System.out.println(air1);
        System.out.println(air2);
    }
}
