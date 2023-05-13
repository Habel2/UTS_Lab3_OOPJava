public class Main {
    public static void main(String[] args) {
        //Fisika menghitung ketinggian maksimum pada gerak vertikal ke atas
        Fisika soal1 = new Fisika(20);
        Fisika soal2 = new Fisika();
        System.out.println("Ketinggian maksimum adalah adalah " + soal1.Rumus());
        System.out.println("Ketinggian maksimum adalah  "+ soal2.Rumus(30, 10));

        //Matematika menghitung luas permukaan bola
        Matematika matematika1 = new Matematika(7.5);
        Matematika matematika2 = new Matematika();
        System.out.println("Luas permukaan bola adalah " + matematika1.Rumus());
        System.out.println("Luas permukaan bola adalah " + matematika2.Rumus(10));

    }

}
