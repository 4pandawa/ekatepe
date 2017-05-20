package ektpek;
import java.util.ArrayList;
import java.util.HashMap;

public class Ektpek {
    public static void main(String[] args) {
         HashMap<String, ArrayList> hash = new HashMap<String, ArrayList>();
        ArrayList<Ktpe> bio = new ArrayList<>();
        bio.add(new Ktpe("201601","Fani    ","Kel. git, rt. 1","Laki-laki","Islam","Mahasiswa"));
        bio.add(new Ktpe("201602","Indra   ","Kel. git, rt. 2","Laki-laki","Islam","Mahasiswa"));
        bio.add(new Ktpe("201603","Azzam   ","Kel. git, rt. 3","Laki-laki","Islam","Mahasiswa"));
        bio.add(new Ktpe("201604","Reza    ","Kel. git, rt. 4","Laki-laki","Islam","Mahasiswa"));
        bio.add(new Ktpe("201611","Invoker ","Kel. Hub, RT. 1","Laki-laki","Islam","Mahasiswa"));
        bio.add(new Ktpe("201612","Lina    ","Kel. Hub, RT. 2","Perempuan","Islam","Mahasiswa"));
        bio.add(new Ktpe("201613","axe     ","Kel. Hub, RT. 3","Laki-laki","Islam","Mahasiswa"));
        bio.add(new Ktpe("201614","riki    ","Kel. Hub, RT. 4","Laki-laki","Islam","Mahasiswa"));
        System.out.println("Nip     Nama        Alamat              Jenis Klamin    Agama       Status");
        for(Ktpe b:bio){
        System.out.println(b.getNip()+"  "+b.getNama()+"    "+b.getAlamat()+"      "+b.getJenisKelamin()+"      "+b.getAgama()+"      "+b.getStatus());
    
        }
        System.out.println("");
        
       // hash.put("nip",bio);
        //System.out.println(hash.get("nip"));
}
}
