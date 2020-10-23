public class Doubler {

    // Variables to make changing things quicker.
    static int start = 3;
    static int max = 2000;
    static int multiplier = 5;
    static String delim = ".";

    public static void main(String[] args) {
        int num = start;

        while(num <= max){
            System.out.print(num + delim + " ");

            num *= multiplier;
        }
    }
}
