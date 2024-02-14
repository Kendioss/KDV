import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonelSecmeProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Aday> adaylar = new ArrayList<>();
        adaylar.add(new Aday("Ahmet", "Üniversite", "Yazılım Mühendisliği", 3, "Java", 8000));
        adaylar.add(new Aday("Ayşe", "Üniversite", "Bilgisayar Mühendisliği", 5, "C++", 9000));
        adaylar.add(new Aday("Mehmet", "Lise", "Bilgisayar Programcılığı", 2, "Python", 7000));

        System.out.print("Pozisyon için eğitim seviyesi girin (Üniversite, Lise): ");
        String egitimSeviyesi = input.next();
        System.out.print("Pozisyon için tecrübe yılı girin: ");
        int tecrubeYili = input.nextInt();
        System.out.print("Pozisyon için gereken yetenekleri girin (Örn: Java, C++): ");
        String yetenekler = input.next();

        Aday enUygunAday = null;
        double enUygunAdayFark = Double.MAX_VALUE;

        for (Aday aday : adaylar) {
            if (aday.getEgitim().equals(egitimSeviyesi) &&
                    aday.getTecrube() >= tecrubeYili &&
                    aday.getYetenekler().contains(yetenekler)) {
                double fark = 0; // Maaş farkını hesaplamıyoruz
                if (fark < enUygunAdayFark) {
                    enUygunAday = aday;
                    enUygunAdayFark = fark;
                }
            }
        }

        if (enUygunAday != null) {
            System.out.println("En uygun aday: " + enUygunAday.getAd());
        } else {
            System.out.println("Uygun aday bulunamadı.");
        }
    }
}

class Aday {
    private String ad;
    private String egitim;
    private String bolum;
    private int tecrube;
    private String yetenekler;
    private double maksimumMaas;

    public Aday(String ad, String egitim, String bolum, int tecrube, String yetenekler, double maksimumMaas) {
        this.ad = ad;
        this.egitim = egitim;
        this.bolum = bolum;
        this.tecrube = tecrube;
        this.yetenekler = yetenekler;
        this.maksimumMaas = maksimumMaas;
    }

    public String getAd() {
        return ad;
    }

    public String getEgitim() {
        return egitim;
    }

    public String getBolum() {
        return bolum;
    }

    public int getTecrube() {
        return tecrube;
    }

    public String getYetenekler() {
        return yetenekler;
    }

    public double getMaksimumMaas() {
        return maksimumMaas;
    }
}
