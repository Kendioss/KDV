import java.util.Scanner;
public class TekSayi {
    public static void main(String[] args) {
        double ortalama=0;
        int total = 0;
        int num;
        int adet=0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz :");
            num=inp.nextInt();
            if(num % 2==1) {
                total += num;
                adet ++;
            }

            }while (num>0);
        if (adet >0) {
            ortalama = (double) total / adet;
            System.out.println("Toplam :" + total);
            System.out.println("Ortalama :"+ortalama);
        }else {
            System.out.println("Hiç tek sayı girilmedi.");
        }

        }
    }