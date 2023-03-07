public class ForestObstacleAdapter implements Obstacle{

    private final Forest forest;

    public ForestObstacleAdapter(Forest forest) {
        this.forest = forest;
    }

    @Override
    public boolean pass(Participant participant) {
        return forest.pass(participant);
    }
}
