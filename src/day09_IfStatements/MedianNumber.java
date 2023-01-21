package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 60, b = 90, c = 30;

        boolean aIsMedian = (b > a && a > c) || (c > a && a > b);
        boolean bIsMedian = (a > b && b > c) || (c > b && b > a);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            System.out.println(a + " is median number");
        }
        if (bIsMedian) {
            System.out.println(b + " is median number");
        }
        if (cIsMedian) {
            System.out.println(c + " is median number");
        }
    }
}
