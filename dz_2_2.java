import java.util.Scanner;

public class dz_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите пароль (не менее 8 символов): ");
        String pasword = sc.nextLine();
        boolean result = pasword.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}");
        boolean result1 = pasword.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[_]).{8,}");
        if (result || result1) {
            System.out.println("Пароль надежен");
        } else {
                System.out.println("Пароль ненадежен. Повторите ввод");
            }
        sc.close();
    }
}