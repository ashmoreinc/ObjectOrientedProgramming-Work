public class AgeChecker {
    public static void main(String[] args) {
        double age = 19.5;

        if(age >= 68) {
            System.out.println("You're a pensioner.");
        } else if(age > 18) {
            System.out.println("You're an adult.");
        } else if (age >= 12){
            System.out.println("You're a young adult.");
        } else if(age > 5){
            System.out.println("You're a child.");
        } else if(age >= 3) {
            System.out.println("You're a toddler.");
        } else if(age <= 0) {
            System.out.println("That's an invalid age.");
        } else {
            System.out.println("You're an infant.");
        }
    }
}
