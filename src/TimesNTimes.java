import java.util.Scanner;

public class TimesNTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayının çarpım tablosunu istiyorsunuz (1-10 arası): ");
        int selectedNumber = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(selectedNumber + "x" + i + "=" + (selectedNumber * i));
        }
    }
}
