package id.ac.polinema.recyclerview.models;

public class NewsCo {

    public String company;
    public String img;
    public String nama;

    public NewsCo(String nama, String company, String img) {
        this.nama = nama;
        this.company = company;
        this.img = img;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


}
