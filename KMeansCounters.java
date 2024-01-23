import org.apache.hadoop.mapreduce.Counter;

public class KMeansCounters {
    public static final String ITERATIONS = "KMeansIterations";
    public static final String CONVERGED = "KMeansConverged";
    public static final String WRITTEN_CENTERS = "KMeansWrittenCenters";
    public static final String WRITTEN_BYTES = "KMeansWrittenBytes";

    public static Counter getIterationsCounter(Context context) {
        return context.getCounter(KMeansCounters.class.getSimpleName(), ITERATIONS);
    }

    public static Counter getConvergedCounter(Context context) {
        return context.getCounter(KMeansCounters.class.getSimpleName(), CONVERGED);
    }

    public static Counter getWrittenCentersCounter(Context context) {
        return context.getCounter(KMeansCounters.class.getSimpleName(), WRITTEN_CENTERS);
    }

    public static Counter getWrittenBytesCounter(Context context) {
        return context.getCounter(KMeansCounters.class.getSimpleName(), WRITTEN_BYTES);
    }
}
