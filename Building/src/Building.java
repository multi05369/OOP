import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your height of building :");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
                System.out.println("#-#-#-#-#");
        }
    }
}
