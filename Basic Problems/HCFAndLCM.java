import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
      
        int hcf = findHCF(num1, num2);

        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b; 
            b = a % b;
            a = temp;
            
        }
        return a;
    }
}
