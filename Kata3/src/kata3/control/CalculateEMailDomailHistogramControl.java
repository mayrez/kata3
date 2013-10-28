package kata3.control;

import java.io.FileNotFoundException;
import kata3.model.HistogramBuilder;
import kata3.persistencia.MailReader;
import kata3.ui.HistogramViewer;

public class CalculateEMailDomailHistogramControl {
    private String filename;
    public CalculateEMailDomailHistogramControl(String filename){
        this.filename=filename;
    }
    public void execute(){
       
        HistogramBuilder<String> builder= new HistogramBuilder<>();
        builder.calculateHistogram(readDomains());
        HistogramViewer<String> viewer =new HistogramViewer<>(builder.getHistogram());
   }    

    private String[] readDomains() {
        MailReader reader= new MailReader();
        try{
             return reader.readDomains(filename);
        }
        catch(FileNotFoundException ex){
            return new String[0];
        }
    }
}
