package id.ac.polinema.recyclerview.models;

public class TeamLogo {
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String logo;
    public String nama;

    public TeamLogo(String logo, String nama) {
        this.logo = logo;
        this.nama = nama;
    }

}
