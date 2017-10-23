package Pack1022;
 
import java.util.Scanner;
 
public class javatest1022 {
     public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         System.out.println("请输入被除数：\n");
         try {
             int num1=input.nextInt();
             System.out.println("请输入除数：\n");
             int num2=input.nextInt();
             System.out.println(String.format("%d / %d = %d",
                     num1, num2, num1 / num2));
              }     catch (Exception e)   {
             System.err.println("出现错误：被除数和除数必须是整数，"+
         "除数不能为零。");
             System.out.println(e.getMessage());
                     }
         System.out.println("在catch循环内的错误提示后"
         		+ "，程序继续到此出：\n");
      }
}