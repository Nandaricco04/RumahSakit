package ShowroomMobil;

public class Mobil {
    private String idMobil;
    private String merk;
    private String tipe;
    private int tahun;
    private double harga;
    private Sales sales;

    public String getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(String idMobil) {
        this.idMobil = idMobil;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public String getInfo(){
        String info = "";
        info += "\t ID Mobil : " + idMobil;
        info += ", Merk  : " + merk;
        info += ", Tipe  : " + tipe;
        info += ", Tahun : " + tahun;
        info += ", Harga : " + harga;
        info += ", Sales : " + sales.getNamaSales();
        info += "\n";

        return info;
    }
}
