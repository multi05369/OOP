import java.util.Scanner;

public class BuidingLineSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = sc.nextInt();
        
        for ( int i = 1; i <= num; i++) {
            System.out.print("|");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
