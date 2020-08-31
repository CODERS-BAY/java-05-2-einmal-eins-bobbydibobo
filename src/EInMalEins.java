public class EInMalEins {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            System.out.printf("%der Reihe", i);
            for (int j = 1; j <= 10; j++) {

                int result = i * j;

                System.out.printf("%n %d * %d = %d", i, j, result);

            }
        }

    }

}
