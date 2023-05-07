public class Main {
    public static void main(String[] args) {
        //Fisika menghitung ketinggian maksimum pada gerak vertikal ke atas
        fisika soal1 = new fisika(20);
        fisika soal2 = new fisika();
        System.out.println("Ketinggian maksimum adalah adalah " + soal1.rumus());
        System.out.println("Ketinggian maksimum adalah  "+ soal2.rumus(30, 10));

        //Matematika menghitung luas permukaan bola
        matematika matematika1 = new matematika(7.5);
        matematika matematika2 = new matematika();
        System.out.println("Luas permukaan bola adalah " + matematika1.rumus());
        System.out.println("Luas permukaan bola adalah " + matematika2.rumus(10));

    }

}
