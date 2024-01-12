import java.util.Scanner;

public class BuidingLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = sc.nextInt();
        String text = "";
        
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                text += "/";
            } else {
                text += "|";
            }
        }
        System.out.println(text);
    }
}
