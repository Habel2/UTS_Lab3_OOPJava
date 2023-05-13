class fisika{
    double kecepatanAwal;
    double Gravitasi;

    //Method Overloading
    public fisika (){
        this.kecepatanAwal=0;
        this.Gravitasi=0;
    }
    public fisika (double kecepatanAwal){
        this.kecepatanAwal=kecepatanAwal;
        this.Gravitasi=10;
    }
    public fisika (double kecepatanAwal, double Gravitasi){
        this.kecepatanAwal=kecepatanAwal;
        this.Gravitasi=Gravitasi;
    }
    //Constructor
    public double rumus(){
        double Ketinggian = (kecepatanAwal*kecepatanAwal)/(2*Gravitasi);
        return Ketinggian;
    }
    public double rumus(double kecepatanAwal, double Gravitasi){
        double Ketinggian = (kecepatanAwal*kecepatanAwal)/(2*Gravitasi);
        return Ketinggian;
    }
}

class matematika{
    double phi;
    double JariJariLingkaran;

    public matematika(){
        this.JariJariLingkaran=0;
    }
    public matematika(double jari){
        this.Jari = Jari;
    }
    public double rumus(){
        double LuasPermukaan = 4*Math.PI*JariJariLingkaran*JariJariLingkaran;
        return LuasPermukaan;
    }
    public double rumus(double JariJariLingkaran){
        double LuasPermukaan = 4*Math.PI*JariJariLingkaran*JariJariLingkaran;
        return LuasPermukaan;
    }
}
