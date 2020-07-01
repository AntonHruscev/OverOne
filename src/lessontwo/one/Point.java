package lessontwo.one;

public class Point {
    private static  int X, Y;

    private int newX;
    private int newY;


     Point(){
        X = 0;
        Y = 0;
    }

    public Point(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Point translate(int x, int y){
       X += x;
       Y += y;
         Point newPoint = new Point(x ,y);
        return newPoint;
    }

    public  Point scale(int x, int y){
         X *= x;
        Y *= y;
        Point newPoint = new Point(x ,y);
        return newPoint;
    }
}
