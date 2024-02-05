import java.util.Scanner;
public class trk {
    public static void main(String[] args) {
        double tutar,kdvOran =0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz :");
        tutar= input.nextDouble();
        double KdvTutar= tutar*kdvOran;
        System.out.print("Kdv Kisim Ucret :");
        System.out.println(KdvTutar);
        double KdvliTutar=KdvTutar+tutar;
        System.out.print("Toplam Ucret :");
        System.out.println(KdvliTutar);
    }
}
