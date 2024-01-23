import java.io.Serializable;
import java.util.Objects;

public class Cluster implements Serializable {
    private double[] point;
    private double sumOfSquaredDistances;
    private int numberOfPoints;

    public Cluster(double[] point, double sumOfSquaredDistances, int numberOfPoints) {
        this.point = point;
        this.sumOfSquaredDistances = sumOfSquaredDistances;
        this.numberOfPoints = numberOfPoints;
    }

    public double[] getPoint() {
        return point;
    }

    public double getSumOfSquaredDistances() {
        return sumOfSquaredDistances;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void addPoint(double[] point, double distance) {
        this.point = point;
        this.sumOfSquaredDistances += distance;
        this.numberOfPoints++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cluster)) return false;
        Cluster cluster = (Cluster) o;
        return Double.compare(cluster.sumOfSquaredDistances, sumOfSquaredDistances) == 0 &&
                numberOfPoints == cluster.numberOfPoints &&
                Arrays.equals(point, cluster.point);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(sumOfSquaredDistances, numberOfPoints);
        result = 31 * result + Arrays.hashCode(point);
        return result;
    }
}
