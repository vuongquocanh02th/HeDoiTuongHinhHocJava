public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(10, 20);
        System.out.println(rectangle);
        rectangle = new Rectangle(20, 50, "orange", true);
        System.out.println(rectangle);
    }
}
