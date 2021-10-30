public class box {
    int length;
    int breadth;

    public box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area(){
        System.out.println("Area = "+length*breadth);
    }
}

class box3d extends box {
    int height;

    public box3d(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    void volume() {
        System.out.println("Volume = " + length * breadth * height);
    }
}

class q4{
    public static void main(String[] args) {
        box obj1 = new box(2,3);
        box3d obj2 = new box3d(2,3,6);
        obj1.area();
        obj2.volume();
    }
}
