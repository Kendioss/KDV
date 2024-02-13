import java.util.Scanner;
public class KuvvetAlma {
    public static void main(String[] args) {
        int num,kuvvet;
        int toplam;
        Scanner input=new Scanner(System.in);
        System.out.print("Hangi sayını üssünü öğrenmek istediğinizi giriniz :");
        num= input.nextInt();

            System.out.print("Kaçıncı kuvvete ulaşmak istediğinizi giriniz :");
            kuvvet= input.nextInt();
        if(num>=0&&kuvvet>0){
            toplam=(int) Math.pow(num,kuvvet);
            System.out.println("Sonuç :"+toplam);
        }else {
            System.out.println("Hatalı bir giriş yaptınız.");
        }


    }
}
