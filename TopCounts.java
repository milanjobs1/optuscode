package count;

public class TopCounts{

    private final long topCounts;
    private final String content;

    public Greeting(long topCounts, String result) {
        this.topCounts = topCounts;
        this.result = result;
    }

    public long getTopCounts() {
        return topCounts;
    }

    public String getResult() {
        return result;
    }
}