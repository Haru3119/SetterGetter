package setget;

public class SetGet {
    
    public static void main(String[] args) {
        Siswa Pertama = new Siswa ();
        Siswa Kedua = new Siswa ();
        
        Pertama.setNama("Satria Yudha anwadani Hidayat");
        Pertama.setAlamat("Pandan Ajeng, Tumpang");
        
        Kedua.setNama("Bahana Alana Khansa");
        Kedua.setAlamat("Pakis, Pakis");
        
        Pertama.print();
        Kedua.print();
    
    }
    
}
