import java.util.Scanner;

public class Potenz {
   public static int power(int base, int exp){
      if (exp !=0){
         return (base * power(base, exp-1));
      }else {
         return 1;
      }
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the base number ::");
      int base = sc.nextInt();
      System.out.println("Enter the exponent number ::");
      int exp = sc.nextInt();
      System.out.println(power(base, exp));
   }
}
