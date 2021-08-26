/* Ввести целые числа как аргументы командной строки, подсчитать их
сумму (произведение) и вывести результат на консоль.*/

public class MainTask04 {

    public static void main(String[] args) {
        long proiz = 1;
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            proiz *= Integer.parseInt(args[i]);
        }
        System.out.printf("Сумма = %d. Произведение = %d", sum, proiz);
    }
}
