/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskelompoksatu;

import java.util.ArrayList;

/**
 *
 * @author Nikho Sagala
 */
public class Studio {

    private String namaStudio;
    private ArrayList<Kursi> kursi;
    private Film namaFilm;


    public Studio(String namaStudio) {
        this.namaStudio = namaStudio;
        this.kursi = new ArrayList<>();
        for (int i = 1; i < 31; i++) {
            kursi.add(new Kursi(i));
        }

    }

    public String getNamaStudio() {
        return namaStudio;
    }

    public void setNamaStudio(String namaStudio) {
        this.namaStudio = namaStudio;
    }

    public void addfilm(String f, String j) {
        namaFilm = new Film(f, j);
    }

    public boolean cekStatusKursi(int index) {
        boolean jing = this.kursi.get(index).isStatus();
        return jing;
    }
    
    public String getKursi(){
        int id=0;
        String a="";
        for (Kursi s: kursi){
            if (!cekStatusKursi(id)){
                a=a+s.getNoKursi()+" ";
            }
        id++;    
        }
        return a; 
    }

    public void gantiStatusKursi(int index) {
        boolean status;
        if (kursi.get(index).isStatus() == true) {
            kursi.get(index).setStatus(false);
        } else {
            kursi.get(index).setStatus(true);
        }
    }

}
