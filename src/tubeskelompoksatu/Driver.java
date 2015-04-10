/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskelompoksatu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ragil Ayu
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pil = -1, studio = 0, kursi = 0;
        String judul = null, jam = null;

        Scanner a = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        // TODO code application logic here

        Bioskop b = new Bioskop("XXX");

        Studio s1 = new Studio("Satu");
        Studio s2 = new Studio("Dua");

        b.addStudio(s2);
        b.addStudio(s1);
        
        b.addFilm("Pussy Cat","12:00");

        System.out.println("MENU");
        System.out.println("1. Add Film");
        System.out.println("2. View Film");
        System.out.println("3. View Kursi Kosong");
        System.out.println("4. Pilih Kursi");
        while (pil != 0) {
            try {
                System.out.print("Pilihan :");
                pil = a.nextInt();

            } catch (RuntimeException e) {
                System.out.println("<Pesan:Inputan Menu Harus 0-4>");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                a = new Scanner(System.in);
            }

            switch (pil) {
                case 1:
                    boolean cek = false;
                    while (cek != true) {
                        try {
                            System.out.print("Judul :");
                            judul = s.nextLine();
                            System.out.print("Jam : ");
                            jam = s.nextLine();
                            cek = true;
                        } catch (InputMismatchException e) {
                            System.out.println("<Pesan : Inputan Jam Harus angka, Judul harus string !>");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        } finally {
                            s = new Scanner(System.in);
                        }

                    }
                    b.addFilm(judul, jam);
                    break;
                case 2:
                    System.out.println(b.viewFilm());
                    break;
                case 3:
                    System.out.println(b.liatKursiKosong());
                    break;
                case 4:
                    boolean status = false;
                    while (status != true) {
                        try {
                            System.out.print("Pilih Studio:");
                            studio = a.nextInt();
                            System.out.print("Kursi yang dipilih: ");
                            kursi = a.nextInt();

                            status = true;
                        } catch (InputMismatchException e) {
                            System.out.println("<Pesan : Inputan Harus angka !>");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        } finally {
                            a = new Scanner(System.in);
                        }

                    }
                    if (studio == 1) {
                        b.pilihKursi(s1, kursi);
                    } else if (studio == 2) {
                        b.pilihKursi(s2, kursi);
                    }
                    break;

            }

        }
    }

}
