package kata3.model;

public class HistogramBuilder<Key> {

    private Histogram<Key> histogram = new Histogram<>();

    

    public Histogram<Key> getHistogram() {
        return histogram;
    }
    public void calculateHistogram(Key[] array) {
        for (Key item : array)
            histogram.put(item, getFrequency(item) + 1);
    }
    private Integer getFrequency(Key item) {
        Integer value = histogram.get(item);
        if(value == null)
            return 0;
        return value;
    }
    
}
