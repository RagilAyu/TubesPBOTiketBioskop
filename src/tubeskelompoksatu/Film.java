/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskelompoksatu;

/**
 *
 * @author Ragil Ayu
 */
public class Film {
    private String judulFilm;
    private String jamTayang;
    private String sinopsis;

    public Film() {
    }
    
    public Film(String judulFilm, String jamTayang) {
        this.judulFilm = judulFilm;
        this.jamTayang = jamTayang;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
        /*
        Method ini untuk menginisialisasikan Judul Film
        */
    }

    public String getJamTayang() {
        return jamTayang;
        
    }

    public void setJamTayang(String jamTayang) {
        this.jamTayang = jamTayang;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
}
