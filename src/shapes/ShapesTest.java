package shapes;

public class ShapesTest {
    public static void main(String[] args) {




        Measurable box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
//
        Measurable myShape = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

    }
}
