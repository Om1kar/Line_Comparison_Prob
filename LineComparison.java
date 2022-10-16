package LineComparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program");
        int x1, x2, y1, y2;
        double lengthOfLine;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values To Compute Length");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        y1 = sc.nextInt();
        y2 = sc.nextInt();
        lengthOfLine = Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);
        System.out.println("Length of line= " + lengthOfLine);
    }
}
