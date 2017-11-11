import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        int j = 0, k = 0, l = 1, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci");


        System.out.print("Enter where in the series to display: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            j = k; //j takes on k value (first loop j = 0)
            k = l; //k takes on k value (first loop k = 0 then 1)
            l = j + k; //adds j and k values to l (first loop 0+1=1)
            }
        System.out.print("The number in the " + n + " place of the series is: " + j);
    }
}
