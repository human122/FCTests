import java.util.Scanner

public class MyKeyboardInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = s.nextLine();
        System.out.println("Теперь введите число");
        int num = s.nextInt();
        System.out.println(string + num);
    }
}