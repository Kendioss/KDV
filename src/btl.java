import java.util.Scanner;

public class btl {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenar Uzunluk :");
        a= input.nextInt();
        System.out.print("2.Kenar Uzunluk :");
        b=input.nextInt();
        c= Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenus :" +c);



    }
}
