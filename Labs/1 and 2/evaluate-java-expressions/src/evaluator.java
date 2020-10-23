public class evaluator {
    public static void main(String[] args) {
        arithmeticOps();
        comparisonOps();
        logicalOps();
        stringOps();
        conversions();

        // Variables and types exercise
        variablesAndTypes();
    }

    public static void arithmeticOps(){
        System.out.println("Arithmetic Operations");
        System.out.println(1 + 1);
        System.out.println(5 - 2 * 3);
        System.out.println((5 - 2) * 3);
        System.out.println(4.5 + 6.7);
        System.out.println(3 - 2.1);
        System.out.println(6 / 2);
        System.out.println(7 / 2);
        System.out.println(7.0 / 2.0);
        System.out.println(8 % 2);
        System.out.println(9 % 2);
    }

    public static void comparisonOps(){
        System.out.println("Comparison Operations");
        System.out.println(1 + 1 == 2);
        System.out.println(1 + 1 != 3);
        System.out.println(1 < 3);
        System.out.println(1 > 3);
        System.out.println(3 <= 3);
        System.out.println(3 >= 1);
    }

    public static void logicalOps(){
        System.out.println("Logical Operations");
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(!false);
    }

    public static void stringOps(){
        System.out.println("String Operations");
        System.out.println("Hello" + "world!");
        System.out.println("Catch" + 22);
        System.out.println("A piece of string".length());
        System.out.println("ABCDEFG".charAt(3));
        System.out.println("MMXVIII".toLowerCase());
        System.out.println("Yellow Submarine".startsWith("Yellow"));
    }

    public static void conversions(){
        System.out.println("Conversions");
        System.out.println((double) 5);
        System.out.println((int) 5.3);
        System.out.println((int) 'a');
        System.out.println((char) 120);
        System.out.println(String.valueOf(1234));
        System.out.println(Integer.parseInt("5678"));
        System.out.println(Double.parseDouble("3.14159"));
    }

    public static void variablesAndTypes(){
        System.out.println("Variables and their types.");
        int age = 19;
        char grade = 'A';
        double gigaWatts = 1.21;
        boolean isBlue = true;
        String phoneNumber = "555-1234";
    }
}
