import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        int birthyear,sign;

        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your birthday :");
        birthyear=input.nextInt();
        sign=birthyear%12;

        switch (sign){

            case 0:
                System.out.println("Your Chinese Zodiac sign :Monkey");
                break;
            case 1:
                System.out.println("Your Chinese Zodiac sign :Cock");
                break;
            case 2:
                System.out.println("Your Chinese Zodiac sign :Dog");
                break;
            case 3:
                System.out.println("Your Chinese Zodiac sign :Pig");
                break;
            case 4:
                System.out.println("Your Chinese Zodiac sign :Mouse");
                break;
            case 5:
                System.out.println("Your Chinese Zodiac sign :Ox");
                break;
            case 6:
                System.out.println("Your Chinese Zodiac sign :Tiger");
                break;
            case 7:
                System.out.println("Your Chinese Zodiac sign :Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese Zodiac sign :Dragon");
                break;
            case 9:
                System.out.println("Your Chinese Zodiac sign :Snake");
                break;
            case 10:
                System.out.println("Your Chinese Zodiac sign :Horse");
                break;
            case 11:
                System.out.println("Your Chinese Zodiac sign :Sheep");
                break;
        }

    }
}
