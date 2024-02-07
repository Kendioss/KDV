import java.util.Scanner;
public class Tempature {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen hava sicakligini giriniz :");
        heat = input.nextInt();
        if (heat<5){
            System.out.println("Kayak yap");
        }else if (heat<=25){
            if(heat<=15){
                System.out.println("Sinemaya git");
            }
            if(heat>=10){
                System.out.println("Piknige git");
            }
        }else if (heat >25){
            System.out.println("Yuzmeye git");
        }

    }
    }