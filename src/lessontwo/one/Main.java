package lessontwo.one;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3,4);
        point.translate(1,1);
        point.scale(2,2);
        System.out.println(point.getX() + ", " + point.getY());

    }
}
