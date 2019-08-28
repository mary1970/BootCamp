package July13;

public class HourGlassWithNumbers {
    public static void main(String[] args) {
        int number = 7;
        int space = 1;
        int line = 7;
        for (int i = 1; i <= line; i++) {
            for (int k = 1; k <= i; k++) {

                System.out.print("-");
            }
            for (int j = i; j <= 7; j++) {
                System.out.print(j + " ");
                number++;
            }
            for (int z = 1; z <= i; z++) {
                System.out.print("-");
            }
            System.out.println();
        }

        for (int i = 6; i >= 1; i--) {

            for (int j =1 ; j <= i; j++) {
                System.out.print("-");
            }

            for (int k =i ; k <= 7; k++) {
                System.out.print(k + " ");


            }
            System.out.println();

        }
    }

}
