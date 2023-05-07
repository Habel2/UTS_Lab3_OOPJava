class fisika{
    double v0;
    double g;

    //Method Overloading
    public fisika (){
        this.v0=0;
        this.g=0;
    }
    public fisika (double v0){
        this.v0=v0;
        this.g=10;
    }
    public fisika (double v0, double g){
        this.v0=v0;
        this.g=g;
    }
    //Constructor
    public double rumus(){
        double h = (v0*v0)/(2*g);
        return h;
    }
    public double rumus(double v0, double g){
        double h = (v0*v0)/(2*g);
        return h;
    }
}

class matematika{
    double phi;
    double jari;

    public matematika(){
        this.jari=0;
    }
    public matematika(double jari){
        this.jari = jari;
    }
    public double rumus(){
        double lp = 4*Math.PI*jari*jari;
        return lp;
    }
    public double rumus(double jari){
        double lp = 4*Math.PI*jari*jari;
        return lp;
    }
}
