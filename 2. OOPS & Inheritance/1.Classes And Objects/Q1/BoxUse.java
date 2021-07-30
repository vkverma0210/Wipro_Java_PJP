import java.util.*;

/**
 * BoxUse
 */
public class BoxUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter width: - ");
        double width = s.nextDouble();

        System.out.print("Enter height: - ");
        double height = s.nextDouble();

        System.out.print("Enter depth: - ");
        double depth = s.nextDouble();

        Box b = new Box(width, height, depth);
        System.out.println("Volume of the box is: " + b.volume());
    }
}