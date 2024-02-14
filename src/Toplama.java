import java.util.Scanner;

public class Toplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen taban sınır sayısını giriniz (1-10 arası): ");
        int selectedN = input.nextInt();

        int toplam = 0;
        for (int i = selectedN; i <= 10; i++) {
            toplam += i;
        }

        System.out.println("Toplam: " + toplam);
    }
}
