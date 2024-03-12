package esraalg;

import java.util.Scanner;

class Ogrenci {

    private String ad;
    private String soyad;
    private int numara;
    private String bolum;

    public Ogrenci(String ad, String soyad, int numara, String bolum) {
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
        this.bolum = bolum;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getNumara() {
        return numara;
    }

    public String getBolum() {
        return bolum;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
}

class LisansOgrencisi extends Ogrenci {

    private String bitirmeProjesi;

    public LisansOgrencisi(String ad, String soyad, int numara, String bolum, String bitirmeProjesi) {
        super(ad, soyad, numara, bolum);
        this.bitirmeProjesi = bitirmeProjesi;
    }

    public String getBitirmeProjesi() {
        return bitirmeProjesi;
    }

    public void setBitirmeProjesi(String bitirmeProjesi) {
        this.bitirmeProjesi = bitirmeProjesi;
    }
}

class YuksekLisansOgrencisi extends Ogrenci {

    private String tezKonusu;
    private String danisman;

    public YuksekLisansOgrencisi(String ad, String soyad, int numara, String bolum, String tezKonusu, String danisman) {
        super(ad, soyad, numara, bolum);
        this.tezKonusu = tezKonusu;
        this.danisman = danisman;
    }

    public String getTezKonusu() {
        return tezKonusu;
    }

    public void setTezKonusu(String tezKonusu) {
        this.tezKonusu = tezKonusu;
    }

    public String getDanisman() {
        return danisman;
    }

    public void setDanisman(String danisman) {
        this.danisman = danisman;
    }
}

class DoktoraOgrencisi extends YuksekLisansOgrencisi {

    private boolean yeterlilik;

    public DoktoraOgrencisi(String ad, String soyad, int numara, String bolum, String tezKonusu, String danisman, boolean yeterlilik) {
        super(ad, soyad, numara, bolum, tezKonusu, danisman);
        this.yeterlilik = yeterlilik;
    }

    public boolean getYeterlilik() {
        return yeterlilik;
    }

    public void setYeterlilik(boolean yeterlilik) {
        this.yeterlilik = yeterlilik;
    }

    public String getYeterlilikDurumu() {
        return yeterlilik ? "Geçti" : "Geçmedi";
    }
}

public class OgrenciProgrami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Bilgileri Alma
        System.out.println("Lisans Öğrencisi Bilgileri:");
        System.out.print("Ad: ");
        String ad = input.nextLine();
        System.out.print("Soyad: ");
        String soyad = input.nextLine();
        System.out.print("Numara: ");
        int numara = input.nextInt();
        input.nextLine(); // Satır sonu karakterini tüket
        System.out.print("Bölüm: ");
        String bolum = input.nextLine();
        System.out.print("Bitirme Projesi: ");
        String bitirmeProjesi = input.nextLine();

        System.out.println("\nYüksek Lisans Öğrencisi Bilgileri:");
        System.out.print("Ad: ");
        String ad2 = input.nextLine();
        System.out.print("Soyad: ");
        String soyad2 = input.nextLine();
        System.out.print("Numara: ");
        int numara2 = input.nextInt();
        input.nextLine(); // Satır sonu karakterini tüket
        System.out.print("Bölüm: ");
        String bolum2 = input.nextLine();
        System.out.print("Tez Konusu: ");
        String tezKonusu = input.nextLine();
        System.out.print("Danışman: ");
        String danisman = input.nextLine();

        System.out.println("\nDoktora Öğrencisi Bilgileri:");
        System.out.print("Ad: ");
        String ad3 = input.nextLine();
        System.out.print("Soyad: ");
        String soyad3 = input.nextLine();
        System.out.print("Numara: ");
        int numara3 = input.nextInt();
        input.nextLine(); // Satır sonu karakterini tüket
        System.out.print("Bölüm: ");
        String bolum3 = input.nextLine();
        System.out.print("Tez Konusu: ");
        String tezKonusu2 = input.nextLine();
        System.out.print("Danışman: ");
        String danisman2 = input.nextLine();
        System.out.print("Yeterlilik (true/false): ");
        boolean yeterlilik = input.nextBoolean();

        LisansOgrencisi lisansOgrencisi = new LisansOgrencisi(ad, soyad, numara, bolum, bitirmeProjesi);
        YuksekLisansOgrencisi yuksekLisansOgrencisi = new YuksekLisansOgrencisi(ad2, soyad2, numara2, bolum2, tezKonusu, danisman);
        DoktoraOgrencisi doktoraOgrencisi = new DoktoraOgrencisi(ad3, soyad3, numara3, bolum3, tezKonusu2, danisman2, yeterlilik);

        // Bilgileri Yazdırma
        System.out.println("\nLisans Öğrencisi Bilgileri:");
        System.out.println("Ad: " + lisansOgrencisi.getAd() + "  Soyad: " + lisansOgrencisi.getSoyad() + "  Numara: " + lisansOgrencisi.getNumara() + "  Bölüm: " + lisansOgrencisi.getBolum() + "  Bitirme Projesi: " + lisansOgrencisi.getBitirmeProjesi() + "\n");

        System.out.println("Yüksek Lisans Öğrencisi Bilgileri:");
        System.out.println("Ad: " + yuksekLisansOgrencisi.getAd() + "  Soyad: " + yuksekLisansOgrencisi.getSoyad() + "  Numara: " + yuksekLisansOgrencisi.getNumara() + "  Bölüm: " + yuksekLisansOgrencisi.getBolum() + "  Tez Konusu: " + yuksekLisansOgrencisi.getTezKonusu() + "  Danışman: " + yuksekLisansOgrencisi.getDanisman() + "\n");

        System.out.println("Doktora Öğrencisi Bilgileri:");
        System.out.println("Ad: " + doktoraOgrencisi.getAd() + "  Soyad: " + doktoraOgrencisi.getSoyad() + "  Numara: " + doktoraOgrencisi.getNumara() + "  Bölüm: " + doktoraOgrencisi.getBolum() + "  Tez Konusu: " + doktoraOgrencisi.getTezKonusu() + "  Danışman: " + doktoraOgrencisi.getDanisman() + "  Yeterlilik: " + doktoraOgrencisi.getYeterlilikDurumu());
    }
}
