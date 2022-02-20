import java.util.Scanner;
public class simplecalculator {
    public static void main(String[] args){
       Scanner utk=new Scanner(System.in);
       System.out.println("Enter first number");
       String input1=utk.nextLine();
       double num1=Double.parseDouble(input1);
       System.out.println("Enter second number");
       String input2=utk.nextLine();
       double num2=Double.parseDouble(input2);
       double result=num1+num2;
       System.out.println("The result is " + result);
    }
}
