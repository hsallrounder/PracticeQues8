public class outer {
    void display(){
        System.out.println("Outer Function");
    }
    public static class inner{
        void display(){
            System.out.println("Inner Function");
        }
    }
}
class classtest{
    public static void main(String[] args) {
        outer obj1 = new outer();
        outer.inner obj2 = new outer.inner();
        obj1.display();
        obj2.display();
    }
}

