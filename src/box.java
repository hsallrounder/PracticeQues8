public class box {
    private int length;
    private int breadth;

    public box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area(){
        return length*breadth;
    }
}

class box3d extends box {
    int height;

    public box3d(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    int volume() {
        return area()*height;
    }
}

class q4{
    public static void main(String[] args) {
        box obj1 = new box(2,3);
        box3d obj2 = new box3d(2,3,6);
        System.out.println(obj1.area());
        System.out.println(obj2.volume());
    }
}
