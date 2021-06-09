package setget;

public class Siswa {
    public String Nama = new String();
    public String Alamat = new String();
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    
    public String getNama(){
        return this.Nama;
    }
    
    public String getAlamat(){
      return this.Alamat;  
    }
    
    public void print(){
        System.out.println("Nama: "+ this.Nama);
        System.out.println("Alamat: "+ this.Alamat);
        
    }}
