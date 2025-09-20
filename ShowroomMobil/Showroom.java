package ShowroomMobil;
import java.util.ArrayList;

public class Showroom {
    private int idShowroom;
    private String namaShowroom;
    private String alamat;
    private ArrayList<Mobil> daftarMobil;

    public Showroom(int idShowroom, String namaShowroom, String alamat) {
        this.idShowroom = idShowroom;
        this.namaShowroom = namaShowroom;
        this.alamat = alamat;
        this.daftarMobil = new ArrayList<Mobil>();
    }

    public int getIdShowroom() {
        return idShowroom;
    }

    public void setIdShowroom(int idShowroom) {
        this.idShowroom = idShowroom;
    }

    public String getNamaShowroom() {
        return namaShowroom;
    }

    public void setNamaShowroom(String namaShowroom) {
        this.namaShowroom = namaShowroom;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void getInfo(){
        String info = "";
        info += "ID Showroom   : " + idShowroom + "\n";
        info += "Nama Showroom : " + namaShowroom + "\n";
        info += "Alamat        : " + alamat + "\n";
        
        if(!daftarMobil.isEmpty()){
            info += "Daftar Mobil:\n";

            for(Mobil mobil : daftarMobil){
                info += mobil.getInfo() + "\n";
            }
        } else {
            info += "Belum ada mobil di showroom ini\n";
        }

        System.out.println(info);
    }

    public void tambahMobil(String idMobil, String merk, String tipe, int tahun, double harga, Sales sales){
        Mobil mobil = new Mobil();
        mobil.setIdMobil(idMobil);
        mobil.setMerk(merk);
        mobil.setTipe(tipe);
        mobil.setTahun(tahun);
        mobil.setHarga(harga);
        mobil.setSales(sales);
        daftarMobil.add(mobil);
    }
}
