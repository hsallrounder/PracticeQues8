public class outer {
    public void display(){
        System.out.println("Outer Function");
    }
    public class inner{
        public void display(){
            System.out.println("Inner Function");
        }
    }
}
class classtest{
    public static void main(String[] args) {
        outer obj1 = new outer();
        obj1.display();
        outer.inner obj2 = obj1.new inner();
        obj2.display();
    }
}

