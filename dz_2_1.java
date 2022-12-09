import java.util.Scanner;

public class dz_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дату в формате 'дд/мм/гггг': ");
        String data = sc.nextLine();
        boolean result = data.matches("(0[1-9]|1[0-9]|2[0-9]|3[0-1])[\\/](0[1-9]|1[0-2])[\\/](19[0-9][0-9]|[2-9][0-9][0-9][0-9])");
        if (result) {
            System.out.println("Введенное выражение является датой");
        } else {
            boolean result1 = data.matches("(0[1-9]|1[0-9]|2[0-9]|3[0-1])[\\.\\-\\,](0[1-9]|1[0-2])[\\.\\-\\,](19[0-9][0-9]|[2-9][0-9][0-9][0-9])");
            if(result1){
                System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
            } else {
                System.out.println("Введенное выражение не является датой");
            }
        }
        sc.close();
    }
}