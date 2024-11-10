public class SquareTest {
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println(s);
        s = new Square(2);
        System.out.println(s);
        s = new Square(3, "yellow", true);
        System.out.println(s);
    }
}
