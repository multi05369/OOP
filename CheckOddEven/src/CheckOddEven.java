import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; 
        int odd = 0;
        int even = 0;
        do {
            num = sc.nextInt();
            if (num % 2 == 0) {
                even += 1;
            } else if (num == -1) {
                break;
            } else {
                odd += 1;
            }
        } while (num != -1);
        System.out.println("Odd number = " + odd + " Even number = " + even);
    }
}
