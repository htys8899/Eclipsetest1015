package Pack1022;
 
import java.util.Scanner;
 
public class javatest1022 {
     public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         System.out.println("�����뱻������\n");
         try {
             int num1=input.nextInt();
             System.out.println("�����������\n");
             int num2=input.nextInt();
             System.out.println(String.format("%d / %d = %d",
                     num1, num2, num1 / num2));
              }     catch (Exception e)   {
             System.err.println("���ִ��󣺱������ͳ���������������"+
         "��������Ϊ�㡣");
             System.out.println(e.getMessage());
                     }
         System.out.println("��catchѭ���ڵĴ�����ʾ��"
         		+ "������������˳���\n");
      }
}