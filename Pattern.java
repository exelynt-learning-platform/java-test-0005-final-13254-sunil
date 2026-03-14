public class Pattern {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 1; i <= 5; i++) {        // controls rows

            for (int j = 1; j <= i; j++) {    // controls numbers in each row
                System.out.print(num + " ");
                num++;
            }

            System.out.println();             // move to next line
        }
    }
}