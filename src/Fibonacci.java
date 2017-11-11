import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        int j = 0, k = 0, l = 1, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci");


        System.out.print("Enter where in the series to display: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            j = k;
            k = l;
            l = j + k;
            }
        System.out.print("The number in the " + n + " place of the series is: " + j);
    }
}
