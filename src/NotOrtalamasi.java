import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int mat,fizik,turkce,toplam;
        System.out.print("Matematik Notunuz :");
        mat=input.nextInt();
        System.out.print("Fizik Notunuz :");
        fizik=input.nextInt();
        System.out.print("Turkce Notunuz :");
        turkce=input.nextInt();

        toplam=((mat+fizik+turkce)/3);
        if (toplam<=55) {
            System.out.println("Sinifta kaldiniz.");
            System.out.println("Ortalamaniz "+ toplam);
        }else{
            System.out.println("Sinifi gectiniz.\nTebrikler.");
            System.out.println("Ortalamaniz "+ toplam);


        }






    }
}
