import java.util.Scanner;
public class diamond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<= 2 * n - 1;i++){
            int star = i >= n ? 2 * n - i : i;

            int spaces = n - star;
            for(int k = 1;k <= spaces;k++){
                System.out.print(" ");
            }

            for(int j=1;j<= star;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
