/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskelompoksatu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ragil Ayu
 */
public class Bioskop {

    private String nama;
    private static int maxfilm = 2;
    private ArrayList<Film> film;
    private ArrayList<Studio> studio;
    private int jmlStudio = 0;

    public Bioskop(String nama) {
        this.nama = nama;
        studio = new ArrayList<>();
        film = new ArrayList<>();
    }

    public Film getFilm(int idx) {
        return film.get(idx);
    }

    public void addStudio(Studio s) {

        if (studio.size() <= 3) {
            this.studio.add(s);
            jmlStudio++;
        } else {
            throw new IllegalArgumentException("Jumlah studio tidak lebih dari 3");
        }
        /*
         Method ini digunakan untuk menambahkan Studio
         */

    }

    public void addFilm(String judul, String jam) {
        Film f = new Film(judul, jam);
        if (film.size() < 5) {
            this.film.add(f);
        } else {
            throw new IllegalArgumentException("Jumlah FIlm tidak lebih dari 5");
        }
        /*
         Method ini digunakan untuk menambahkan Film
         */
    }

    public String viewFilm() {
        String a = "";
        for (Film f : film) {
            a = a + f.getJudulFilm() + " ";
        }
        return a;
        /*
         Method ini digunakan untuk melihat seluruh list film di Bioskop
         */
    }

    public String liatKursiKosong() {
        int id = 1;
        String a = "";
        for (Studio s : studio) {
            a = a + "Kursi Kosong Studio " + id + "\n";
            a = a + s.getKursi() + "\n";
            id++;
        }

        return a;
        /*
         Method ini digunakan untuk melihat daftar kursi kosong tiap Studio
         */
    }

    public void pilihKursi(Studio s, int id) {
        if (!s.cekStatusKursi(id)) {
            s.gantiStatusKursi(id);
        } else {
            throw new IllegalArgumentException("Kursi Sudah Terisi");
        }
        /*
         Method ini digunakan untuk memilih Kursi di Studio tertentu
         */
    }

}
