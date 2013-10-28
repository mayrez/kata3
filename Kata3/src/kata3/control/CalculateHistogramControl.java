package kata3.control;

import kata3.model.HistogramBuilder;
import kata3.ui.HistogramViewer;

public class CalculateHistogramControl<T> {
    private T[] array;
    public CalculateHistogramControl (T[] array){
        this.array=array;
    }
    public void execute(){
        HistogramBuilder builder = new HistogramBuilder();
        builder.calculateHistogram(array);
        HistogramViewer viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
   
}
