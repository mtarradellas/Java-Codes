package TP4;

public class Histogram {
    private int histogram[] = new int[10];
    private int maxHight;

    public void add(int num){
        histogram[num/10]++;
        int hight = histogram[num/10];
        if( maxHight<hight )
            maxHight = hight;
    }

    public String format(){
        String s = "";
        for(int i = maxHight; i>0; i--) {
            s += formatRow(i);
        }
        for(int j=0; j<10; j++)
            s+="+---";
        s+="+\n";
        s+="0   10  20  30  40  50  60  70  80  90  100\n";
        return s;
    }

    private String formatRow(int row){
        String s = "";
        for(int i=0; i<10; i++) {
            s+="| ";
            if(histogram[i]>=row)
                s+="* ";
            else s+= "  ";
        }
        s+= "|\n";
        return s;
    }
}
