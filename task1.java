public class task1 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {

            if (i == 7) {
                continue;
            }

            if (i == 10) {
               break;
            }
            System.out.println("Number: " + i);
        }

    }
}