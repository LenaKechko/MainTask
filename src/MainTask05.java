import java.util.Scanner;

/*Ввести число от 1 до 12. Вывести на консоль название месяца,
соответствующего данному числу. Осуществить проверку корректности ввода чисел*/
public class MainTask05 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        Scanner sc = new Scanner(System.in);
        try {
            int number = Integer.parseInt(sc.nextLine());
            if (number < 1 || number > 12) {
                System.out.println("Введите число из диапазона от 1 до 12.");
            } else {
                System.out.println("Месяц:" + months[number - 1]);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Введите число от 1 до 12.");
        }
    }

}
