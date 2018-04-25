public class Histogram{
    private int histogram[] = new int[10];
    private int maxHight = 0;

    public void add(int num){
        int hight = histogram[num/10]++;
        if( maxHight<hight )
            maxHight = hight;
    }

    public String format(){
        String s = "";
        for(int i = 0; i<10; i++)
            s += formatLevel(i);
        return s;
    }

    private String formatLevel(int level){
        String s = "";
        for( i=0; i<maxHight; i++){
            s += "| ";
            if (histogram[level]>=i)
                s += "* ";
            else s += "  ";
        }
    }
}
