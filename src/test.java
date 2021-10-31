public interface test{
    public int square(int x);
}
class arithmetic implements test{
    @Override
    public int square (int y){
        System.out.println("inside arith");
        return (y*y);
    }
}
class ToTestInt {
    public int ans (int a){
        arithmetic d = new arithmetic ();
        return d.square(a);
    }
    public static void main(String[] args) {
        ToTestInt x = new ToTestInt();
        System.out.println(x.ans(18));
    }
}