//class
public class Anjing {
    String jenis;
    int berat;
    int umur;
    
    //cosntructor
    public Anjing(){
        this.jenis = "Golden";
        this.berat = 40;
        this.umur = 7;
    }
    
    public Anjing(String jenis, int berat, int umur){
        this.jenis = jenis;
        this.berat = berat;
        this.umur = umur;
    }

    //setter
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    //getter
    public String getJenis(){
        return jenis;
    }

    //method
    void bark() {
        System.out.println("Woof");
    }
    void eat() {
        System.out.println("Bang, makan bang");
    }
    //method overloading
    void deskripsi(String jenis){
        System.out.println("Jenis = "+ jenis);
    }
    void deskripsi(String jenis, int umur){
        System.out.println("Jenis = "+ jenis);
        System.out.println("Umur = "+ umur);
    }
    void deskripsi(String jenis, int umur, int berat){
        System.out.println("Jenis = "+ jenis);
        System.out.println("Umur = "+ umur);
        System.out.println("Berat = "+ berat);
    }
}
