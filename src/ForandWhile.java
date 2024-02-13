import java.util.Scanner;

public class ForandWhile {
    public static void main(String[] args) {
        int k;
        int total = 0; // Toplamı hesaplamak için bir değişken tanımlayın
        int count = 0; // Toplamda kaç tane sayı olduğunu takip etmek için bir değişken tanımlayın
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        k = input.nextInt();
        input.close(); // Scanner nesnesini kapatın

        // Kullanıcının girdiği sayıdan 50'ye kadar olan sayıları kontrol edin
        while (k <= 50) {
            if (k % 3 == 0 && k % 4 == 0) { // 3 ve 4'e bölünebilen sayıları bulun
                System.out.println(k);
                total += k; // Toplam değişkenine bu sayıyı ekleyin
                count++; // Sayacı bir artırın
            }
            k++; // Sonraki sayıya geçin
        }

        // Eğer hiç sayı bulunamadıysa, ortalama hesaplamasını yapmadan önce kontrol edin
        if (count > 0) {
            double average = (double) total / count; // Toplamı sayı adedine bölerek ortalama hesaplayın
            System.out.println("Aritmetik ortalama: " + average);
        } else {
            System.out.println("Girilen aralıkta 3 ve 4'e tam bölünebilen bir sayı bulunamadı.");
        }
    }
}