package July12;

public class PersonalExerciseRectangle {
    public static void main(String[] args) {
        /*int rowcount = 8;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= rowcount / 2; j++) {
                System.out.print(" * ");
            }


            System.out.println();
        }*/
        int star = 1;
        int space = 4;
        int rc = 9;
        for (int i = 1; i <= rc; i++) {
            for (int j = 1; j <= rc; j++) {
                System.out.print(" ");
                for (int k =1; k <= i+2; k++){
                    System.out.println(" *");
                }


                if (star < 5) {
                    space--;
                    star = star + 2;

                } else {
                    space++;
                    star = star + 2;

                }
                System.out.println();

            }

        }

    }
}



