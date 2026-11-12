
public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distance = 0;
    private int numberOfVictories = 0;

    @Override
    public void drive() {
        distance += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return distance;
    }

    public void setNumberOfVictories(int victories) {
        numberOfVictories = victories;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.numberOfVictories, this.numberOfVictories);
    }
}
