import java.util.Scanner;

public class MyDivideByNullException {
  public static void main(String[] args) {
    int c = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Введите целое число");
    int a = s.nextInt();
    System.out.println("Введите еще одно целое число");
    int b = s.nextInt();
    try {
      c = a / b;
    } catch (Exception e) {
      System.out.println("Ай-ай, вы пытались поделить на 0, " +
              "полюбуйтесь на стектрейс");
      e.printStackTrace();
    }
    System.out.println("Результат деления первого числа " +
            "на второе число равен: " + c);
  }

}
