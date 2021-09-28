package zuoye42;

public class HistogramFactory implements ChartFactory{
    public Chart createChart(){
        Chart chart;
        chart=new Histogram();
        return chart;
    }
}
