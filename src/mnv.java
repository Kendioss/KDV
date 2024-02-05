import java.util.Scanner;
public class mnv {
    public static void main(String[] args) {

        double elma=2.14,armut=3.67,domates=1.11,muz=0.95,patlican=5,satis;
        Scanner input=new Scanner(System.in);

        System.out.print("Elma kg :");
        elma=input.nextDouble();
        System.out.print("Armut kg :");
        armut=input.nextDouble();
        System.out.print("Domates kg :");
        domates= input.nextDouble();
        System.out.print("Muz kg :");
        muz= input.nextDouble();
        System.out.print("Patlican kg :");
        patlican=input.nextDouble();
        satis= ((elma*2.14)+(armut*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5));
        System.out.println("Fis Tutari : " +satis);










    }
}
