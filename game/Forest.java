public class Forest {

    private final int distance;

    public Forest(int distance) {
        this.distance = distance;
    }

    public boolean pass(CanBicycle canBicycle) {
        return canBicycle.getBicycle() >= distance;
    }
}