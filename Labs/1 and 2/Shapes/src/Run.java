public class Run {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(new Vector2D(1, 3), new Vector2D(4, 5));

        System.out.println("Rectangle: ");
        rect.printRectangle();

        System.out.println("Rectangle center: ");
        System.out.println(rect.center().getX() + ", " + rect.center().getY());

        Vector2D point = new Vector2D(2, 4);

        System.out.println("The rectangle contains the point (x, y) (2, 4): " + rect.contains(point));

        System.out.println("Run completed.");
    }
}
