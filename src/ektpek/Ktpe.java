package ektpek;
public class Ktpe {
    private String nip;
    private String nama;
    private String alamat;
    private String jenisKelamin;
    private String agama;
    private String status;
    
    

    public Ktpe(String nip, String nama, String alamat, String jenisKelamin ,String agama, String status){ 
      this.nip=nip;
      this.nama=nama;
      this.alamat= alamat;
      this.jenisKelamin= jenisKelamin;
      this.agama = agama;
      this.status= status;
    }
    
    public String getNip(){
        return nip;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    
    public String getAgama(){
        return agama;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void data(){
        Ktpe data = new Ktpe("001","ardiansyah","malang","laki-laki","islam","belum menikah");
        
    }
}
