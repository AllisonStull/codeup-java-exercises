package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength() {
//        super.length = this.
    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.width * this.width;
    }


//    protected double side;

//    public Square(double side) {
//        super(side,side);
////        this.side = side;
//    }
//
//    public double getPerimeter() {
//        System.out.println("**In Square.getPerimeter()**");
//        return 4 * this.width;
//    }
//
//    public double getArea() {
//        System.out.println("**In Square.getArea()**");
//        return this.width * this.width;
//    }

}

