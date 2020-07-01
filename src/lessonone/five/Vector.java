package lessonone.five;

public class Vector {
    private static String vectorName;
    private double x;
    private double y;
    private double z;

    public Vector(){}

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(String vectorName, double x, double y, double z){
        this.vectorName = vectorName;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setVectorName(String vectorName) {
        this.vectorName = vectorName;
    }

    public String getVectorName() {
        return vectorName;
    }

    public void setX(double x ){
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }
}
