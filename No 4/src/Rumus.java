class Fisika{
    double kecepatanAwal;
    double Gravitasi;

    //Method Overloading
    public Fisika (){
        this.kecepatanAwal=0;
        this.Gravitasi=0;
    }
    public Fisika (double kecepatanAwal){
        this.kecepatanAwal=kecepatanAwal;
        this.Gravitasi=10;
    }
    public Fisika (double kecepatanAwal, double Gravitasi){
        this.kecepatanAwal=kecepatanAwal;
        this.Gravitasi=Gravitasi;
    }
    //Constructor
    public double Rumus(){
        double Ketinggian = (kecepatanAwal*kecepatanAwal)/(2*Gravitasi);
        return Ketinggian;
    }
    public double Rumus(double kecepatanAwal, double Gravitasi){
        double Ketinggian = (kecepatanAwal*kecepatanAwal)/(2*Gravitasi);
        return Ketinggian;
    }
}

class Matematika{
    double phi;
    double JariJariLingkaran;

    public Matematika(){
        this.JariJariLingkaran=0;
    }
    public Matematika(double jari){
        this.Jari = Jari;
    }
    public double Rumus(){
        double LuasPermukaan = 4*Math.PI*JariJariLingkaran*JariJariLingkaran;
        return LuasPermukaan;
    }
    public double Rumus(double JariJariLingkaran){
        double LuasPermukaan = 4*Math.PI*JariJariLingkaran*JariJariLingkaran;
        return LuasPermukaan;
    }
}
