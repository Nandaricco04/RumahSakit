package ShowroomMobil;

public class Sales {
    private String idSales;
    private String namaSales;
    
    public Sales(String idSales, String namaSales) {
        this.idSales = idSales;
        this.namaSales = namaSales;
    }

    public String getIdSales() {
        return idSales;
    }

    public void setIdSales(String idSales) {
        this.idSales = idSales;
    }

    public String getNamaSales() {
        return namaSales;
    }

    public void setNamaSales(String namaSales) {
        this.namaSales = namaSales;
    }

    public String getInfo(){
        return namaSales + " (" + idSales + ")";
    }
}
