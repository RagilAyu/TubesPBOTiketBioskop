/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskelompoksatu;

/**
 *
 * @author Nikho Sagala
 */
public class Kursi {
    private int noKursi;
    private boolean status=false;
    
    /*
     *  @param noKursi 
    */
    public Kursi() {
    }

    public Kursi(int noKursi) {
        this.noKursi = noKursi;
        status = false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the noKursi
     */
    public int getNoKursi() {
        return noKursi;
    }
    
}
