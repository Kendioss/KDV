import java.util.Scanner;
public class tksm {
    public static void main(String[] args) {
        int km;
        double perKm=2.20,total=10;

        Scanner input= new Scanner(System.in);
        System.out.print("Mesafeyi Km cinsinden yaziniz :");
        km= input.nextInt();
        total+=(km*perKm);
        total=(total<20) ? 20 : total;

        System.out.print("Toplam Odenecek Tutar :");
        System.out.println(total);

    }
}
