public class TenGreenBottles {
    public static void main(String[] args) {
        String word = "";
        String wordDeduct = "";
        for (int i=10; i > 0; i--){
            if(i > 2 || i < 1) {
                word = i + " green bottles";
                wordDeduct = (i - 1) + " green bottles";
            } else if (i == 2) {
                word = i + " green bottles";
                wordDeduct = (i-1) + " green bottle";
            } else if (i == 1) {
                word = i + " green bottle";
                wordDeduct = "no green bottles";
            } // further cases are handled by the check for greater than 2 or less than 1 in the initial case.
            // However the loop being limited to 0 as the lowest case handles this itself.

            System.out.println(word + ", hanging on the wall");
            System.out.println(word + ", hanging on the wall");
            System.out.println("And if one green bottle");
            System.out.println("should accidentally fall");
            System.out.println("There'll be " + wordDeduct);
            System.out.println("hanging on the wall.\n");
        }
    }
}
