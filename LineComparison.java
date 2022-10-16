package LineComparison;

import java.util.Objects;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program");
        int x1, x2, y1, y2, x3, x4, y3, y4;
        double lengthOfLine1;
        double lengthOfLine2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Co-ordinate of x1");
        x1 = sc.nextInt();

        System.out.println("Enter Co-ordinate of x2");
        x2 = sc.nextInt();

        System.out.println("Enter Co-ordinate of y1");
        y1 = sc.nextInt();

        System.out.println("Enter Co-ordinate of y2");
        y2 = sc.nextInt();

        System.out.println("Enter Co-ordinate of x3");
        x3 = sc.nextInt();

        System.out.println("Enter Co-ordinate of x4");
        x4 = sc.nextInt();

        System.out.println("Enter Co-ordinate of x3");
        y3 = sc.nextInt();

        System.out.println("Enter Co-ordinate of y4");
        y4 = sc.nextInt();

        lengthOfLine1 = Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);
        lengthOfLine2 = Math.sqrt((x4 - x3) * 2 + (y4 - y3) * 2);
        System.out.println("Length of line1= " + lengthOfLine1);
        System.out.println("Length of line2= " + lengthOfLine2);
        System.out.println("After Comparing");

        if (Objects.equals(lengthOfLine1, lengthOfLine2))
            System.out.println("Both Are Equal");

        else System.out.println("Not Equal");
    }
}
