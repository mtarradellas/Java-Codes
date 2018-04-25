public class Histograma {

    public static void main(String[] args){
        Histogram histograma = new Histogram();
        for(String num : args){
            histograma.add(Integer.parseInt(num));
        }
        System.out.print(histograma.format());
    }
}
