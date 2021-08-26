import java.util.Scanner;

/*Вывести заданное количество случайных чисел с переходом и без перехода на новую строку*/

public class MainTask03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input count number:");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = (int) (Math.random() * 10);
        }
        System.out.println("Output:");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }
    }
}
