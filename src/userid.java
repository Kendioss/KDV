import java.util.Scanner;
public class userid {
    public static void main(String[] args) {
        String username,password;
        Scanner input=new Scanner(System.in);

        System.out.print("Kullanici Adi :");
        username= input.nextLine();
        System.out.print("Sifreniz :");
        password= input.nextLine();

        if(username.equals("Kendios")&& password.equals("Berat1907")){
            System.out.println("Giris Yapiliyor !");
        }else{
            System.out.println("Kullanici adi veya sifre hatali !");
        }

    }
}
