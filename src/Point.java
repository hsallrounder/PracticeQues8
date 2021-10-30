public class Point {
    private int x,y;

    public Point() {
        x = 6;
        y = 10;
        System.out.println("Non-Parameterized Constructor: x="+x+" y="+y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Parameterized Constructor: x=" + x + " y=" + y);
    }

    public void setX(int x) {
        this.x = x;
        System.out.println("x using setter = "+x);
    }

    public void setY(int y) {
        this.y = y;
        System.out.println("y using setter = "+y);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Using setter XY; x="+x+" y="+y);
    }
}
class q3{
    public static void main(String[] args) {
        Point obj = new Point();
        Point obj2 = new Point(2,6);
        obj.setX(8);
        obj.setY(7);
        obj.setXY(9,5);
    }
}