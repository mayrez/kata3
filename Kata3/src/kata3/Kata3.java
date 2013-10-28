package kata3;

import kata3.control.CalculateHistogramControl;
import kata3.control.CalculateEMailDomailHistogramControl;

public class Kata3 {

    public static void main(String[] args) {
        Integer [] array = {1,2,3,4};
        CalculateHistogramControl<Integer> control = new CalculateHistogramControl<>(array);
        control.execute();
        String filename = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata3";
        CalculateEMailDomailHistogramControl control2 = new CalculateEMailDomailHistogramControl(filename);
        control2.execute();
    }

}
