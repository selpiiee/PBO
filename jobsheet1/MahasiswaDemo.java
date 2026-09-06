package jobsheet1;

//soal nomor 4 experiment 1//

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.name = "Yansy Ayuningtyas";
        m1.address = "Nias, Sumatera Utara";
        m1.grade = "2A";

        //soal nomor 12 experiment 1//
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "029921";
        m2.name = "Fitriani";
        m2.address = "Kediri";
        m2.grade ="2G";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "04411";
        m3.name = "Aisyatul Huriyah";
        m3.address = "Malang";
        m3.grade = "2G";

        m1.displayBiography();
        System.out.println(" ");
        m2.displayBiography();
        System.out.println(" ");
        m3.displayBiography();
    }
}
