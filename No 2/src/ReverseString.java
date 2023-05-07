public class ReverseString {
    public String perhuruf(String kata){
        char[] huruf = kata.toCharArray();
        int n = huruf.length;
        for(int i=0; i<n/2; i++){
            char temp = huruf[i];
            huruf[i] = huruf[n-i-1];
            huruf[n-i-1] = temp;
        }
        return new String(huruf);
    }
    public String perkata(String kata){
        String[] kalimat = kata.split(" ");
        String gabung = "";
        for (int i= kalimat.length -1; i>=0; i--){
            gabung += kalimat[i] + " ";
        }
        return gabung;
    }
}
