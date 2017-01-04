package count;

public class Count{

    private final long counts;
    private final String content;

    public Greeting(long counts, String result) {
        this.counts = counts;
        this.result = result;
    }

    public long getCounts() {
        return counts;
    }

    public String getResult() {
        return result;
    }
}