/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_rana_saltarina;

/**
 *
 * @author jean
 */
public class rana {
    private String rana;
    private int posX;
    private int posy;

    public rana(String rana, int posX, int posy) {
        this.rana = rana;
        this.posX = posX;
        this.posy = posy;
    }

    
    
    public String getRana() {
        return rana;
    }

    public void setRana(String rana) {
        this.rana = rana;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
    
    
}
