package TP5.Point;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(!(o instanceof Point))
            return false;
        Point aux = (Point) o;
        if(this.getX() == aux.getX())
            return this.getY() == aux.getY();
        return false;
    }

    @Override
    public int hashCode(){
        int result;
        long h1 =  Double.doubleToLongBits(this.getX());
        long h2 =  Double.doubleToLongBits(this.getY());
        result = (int) (h1 ^ (h1 >>> 32));
        result = 31 * result + (int) (h2 ^ (h2 >>> 32));
        return result;
    }
    @Override
    public String toString(){
        return String.format("{%g,%g}", x, y);
    }
}
