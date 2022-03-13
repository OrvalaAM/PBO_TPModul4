package jobs;

import java.util.Date;
import java.text.SimpleDateFormat;  
import java.time.LocalDate;

public class Artist {
    private String name;
    private Date birthdate;
    private int age;
    
    public Artist(){}
    public Artist(String name, String _birthdate){
        this.name = name;
        SimpleDateFormat convert = new SimpleDateFormat("yyyy-MM-dd");
        try{
            birthdate = convert.parse(_birthdate);
        }
        catch(Exception ex){
            System.out.println("Format salah");
        }
        int lahir = birthdate.getYear() + 1900;
        LocalDate current = LocalDate.now();
        int now = current.getYear();
        age = now-lahir;
    }
    
    public void setName(String nama){
        name = nama;
    }
    public void setBirthdate(Date tanggal){
        birthdate = tanggal;
    }
    public void setAge(int umur){
        age = umur;
    }
    public String getName(){
        return name;
    }
    public String getBirthdate(){
        String[] daftarBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        
        String tanggal = Integer.toString(birthdate.getDate());
        String tahun = Integer.toString(birthdate.getYear()+1900);
        String bulan = Integer.toString(birthdate.getMonth());
        for(int i = 0; i<12;i++){
            if(i == birthdate.getMonth()){
                bulan = daftarBulan[i];
                break;
            }
        }
        return tanggal + " " + bulan + " " + tahun;
    }
    public int getAge(){
        return age;
    }
    public void displayInfo(){
        System.out.println("Artist name : "+name);
        System.out.println("Birthdate   : "+getBirthdate());
        System.out.println("Age         : "+age);
        System.out.println();
    }
}
