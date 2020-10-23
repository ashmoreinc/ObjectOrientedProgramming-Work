public class Rectangle {
    private Vector2D vec1, vec2;

    public Rectangle(Vector2D vec1, Vector2D vec2){
        this.vec1 = vec1;
        this.vec2 = vec2;
    }

    // Getters
    public Vector2D getVec1() {
        return vec1;
    }

    public Vector2D getVec2() {
        return vec2;
    }

    public double width(){
        return vec2.getX() - vec1.getX();
    }

    public double height(){
        return vec2.getY() - vec1.getY();
    }

    public double area(){
        return width() * height();
    }

    public Vector2D center(){
        return vec1.add(vec2).scale(0.5);
    }

    // Output
    public void printRectangle(){
        System.out.println("Vector 1: ");
        vec1.printVector();
        System.out.println();
        System.out.println("Vector 2: ");
        vec2.printVector();
    }

    // Other
    public boolean contains(Vector2D point){
        return (vec1.getX() <= point.getX() && point.getX() <= vec2.getX()) &&
                (vec1.getY() <= point.getY() && point.getY() <= vec2.getY());
    }
}
