/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xarxacentres;

/**
 *
 * @author Bernat2
 */
public class Materia {
    private Cicle cicle;
    private String denominacio;
    private int nivell;
    
    public Materia(String denominacio,int nivell){
        this.denominacio=denominacio;
        this.nivell=nivell;
    }

    public Cicle getCicle() {
        return cicle;
    }

    public void setCicle(Cicle cicle) {
        this.cicle = cicle;
    }

    public String getDenominacio() {
        return denominacio;
    }

    public void setDenominacio(String denominacio) {
        this.denominacio = denominacio;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }
    
    
    
}
