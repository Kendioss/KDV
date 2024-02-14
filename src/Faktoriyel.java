import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Faktöriyel sayısını giriniz :");
        int n = inp.nextInt();
        int total=1;

        for (int i = 1; i <= n; i++) {
            total=total*i;
            }
        System.out.println(n+ "!=" +total);
    }
    }
