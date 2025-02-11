package garden.vegetables;

public class ForExample2 {

    public static void main(String[] args){

        // You cannot reference a label inside a for loop that is not
        // associated to the for loop, unless the for loop is nested
        int i = 0, j = 0,jmax = 4;

        OUTER_LABEL:
        for (i = 0; i <= 4; i++) {
            System.out.println(" i = " + i + " FIRST STATEMENT");
            if (i == 0) {
                System.out.println("\t i = " + i + ", CONTINUE OUTER_LABEL");
                continue OUTER_LABEL;
            }

            INNER_LABEL:
                for (j = 0; j < 3; j++) {
                System.out.println("\t\tj = " + j + " FIRST ");
                if (i == 1 && j == 0) {
                    System.out.println("\t\t\tj = " + j + " CONTINUE INNER_LABEL");
                    continue INNER_LABEL;
                }
                if (i == 2 && j == 1) {
                    System.out.println("\t\t\tj = " + j + " BREAK INNER_LABEL");
                    // Here, we are breaking out of the inner loop
                    break INNER_LABEL;
                }
                if (i == 3 && j == 2) {
                    System.out.println("\t\t\tj = " + j + " BREAK OUTER LABEL");
                    // Here we are breaking out of both loops
                    break OUTER_LABEL;
                }  System.out.println("\t\tj = " + j + " LAST ");


            }
            System.out.println(" i = " + i + " LAST STATEMENT");
        }
        System.out.println("OUTSIDE OF LOOPS: i = " + i + ", j = " + j);

    }
}
