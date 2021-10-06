
package timgiaothua;

import java.util.Scanner;
public class Timgiaothua {

   
    public static void main(String[] args) {
        int num;
        System.out.print("nhap num");
        Scanner scanner = new Scanner(System.in);
         num = scanner.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
           
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
    
}
