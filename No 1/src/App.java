public class App {
    public static void main(String[] args) throws Exception {
        //object
        anjing anjing1 = new anjing();
        anjing1.jenis = "Rotweiller";
        anjing1.berat = 45;
        anjing1.umur = 6;
        anjing1.bark();
        anjing anjing2 = new anjing();
        System.out.println(anjing2.jenis);
        anjing2.deskripsi("Shiba Inu", 5, 8);
        System.out.println(anjing1.getJenis());
    }
}
