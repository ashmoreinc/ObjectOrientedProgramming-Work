public class Circle {
    private Vector2D center;
    private double radius;

    public Circle(Vector2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Getters
    public double diameter(){
        return 2 * radius;
    }

    public double area (){
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean contains (Vector2D point) {
        Vector2D offset = point.subtract(center);
        return offset.length() <= radius;
    }

    // Other
    public Rectangle boundingBox(){
        Vector2D vec1, vec2;
        vec1 = new Vector2D(center.getX() - radius, center.getY() - radius);
        vec2 = new Vector2D(center.getX() + radius, center.getY() + radius);

        return new Rectangle(vec1, vec2);
    }
}
