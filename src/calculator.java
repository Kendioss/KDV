import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz :");
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz :");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama islemi sonucunuz :" + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma islemi sonucunuz :" + (n1 - n2));
                break;
            case 3 :
                System.out.println("Carpma islemi sonucunuz :" + (n1 * n2));
                break;
            case 4 :
                System.out.println("Bolme islemi sonucunuz :" + (n1 / n2));
                break;
            default:
                System.out.println("Hata ! Lutfen 1-4 arasinda bir secim yapiniz.");

        }
    }
}

