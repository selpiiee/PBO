
public class Pegawai {
    public String nip;
    public String name;
    private double gaji;

    public Pegawai() {
        System.out.println("Objek dari class Pegawai dibuat");
    }

    public String getInfo() {
        String info = "";
        info += "NIP\t: " + nip + "\n";
        info += "Name\t: " + name + "\n";
        info += "Gaji\t: " + gaji + "\n";

        return info;
    }
}
