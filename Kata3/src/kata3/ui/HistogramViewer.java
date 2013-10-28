package kata3.ui;

import kata3.model.Histogram;

public class HistogramViewer<Key> {

    private Histogram<Key> histogram;

    public HistogramViewer(Histogram histogram) {
        this.histogram = histogram;
    }
    
    public void show(){
        for (Key integer : histogram.keySet()) 
            System.out.println(integer + ": " + histogram.get(integer));
    }
}
