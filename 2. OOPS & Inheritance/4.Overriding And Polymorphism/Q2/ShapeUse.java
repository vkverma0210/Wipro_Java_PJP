public class ShapeUse {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}
