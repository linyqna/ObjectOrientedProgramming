package Jobsheet2.Assignment;

public class Rectangle {
    public int rlong = 0;
    public int rwide = 0;

    public int getArea() {
        return rlong * rwide;
    }

    public int getCircumference() {
        return 2 * (rlong + rwide);
    }

    public void displayInfo() {
        System.out.println("Rectange Long   : " + rlong + " m");
        System.out.println("Rectangle Wide  : " + rwide + " m");
        System.out.println("Rectange Area   : " + getArea() + " m^2");
        System.out.println("Circumference   : " + getCircumference() + " m");
    }
}
