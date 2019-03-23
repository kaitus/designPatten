package Solid.LiskovSubtitutionPrinciple;

public class LSPDemo {

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);

        Rectangle sq = new Square();
        sq.setHeight(10);
        sq.setWidth(10);
        useIt(sq);
    }

    // maybe conform to ++
    static void useIt(Rectangle r)
    {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width*10) + ", got " + r.getArea());
    }

}
