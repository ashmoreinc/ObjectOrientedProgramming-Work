
public class Vector2D {
    private double x, y;

    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector2D(){
        // Default constructor. Creates a vector coordinate ate the origin point.
        this.x = 0.0;
        this.y = 0.0;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Translation
    public Vector2D scale (double factor) {
        double newX = this.x * factor;
        double newY = this.y * factor;

        return new Vector2D(newX, newY);
    }

    public Vector2D subtract(Vector2D point) {
        // Returns a Vector2D as that is what is needed in the Circle.contains(Vector2D),
        // however the python implementation did not do this.
        // It also takes a Vector2D as parameter rather than the 2 doubles that the Python implementation did
        double newX = x - point.getX();
        double newY = y - point.getY();

        return new Vector2D(newX, newY);
    }

    public Vector2D add(Vector2D vector){
        double newX = this.x + vector.x;
        double newY = this.y + vector.y;

        return new Vector2D(newX, newY);
    }

    public double length(){
        double squared = Math.pow(this.x, 2) + Math.pow(this.y, 2);
        return Math.sqrt(squared);
    }

    // Output
    public void printVector(){
        System.out.println("Vector X: " + x);
        System.out.println("Vector Y: " + y);
        System.out.println("Vector length: " + this.length());
    }
}
