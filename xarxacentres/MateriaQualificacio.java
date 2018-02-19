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
public class MateriaQualificacio {
    private Materia materia;
    private int qualifi;
    //private undefined qualifiacioExtraordinaria;
    
    public MateriaQualificacio(Materia materia,int nota){
        this.materia=materia;
        qualifi=nota;
    }
    
    public Materia getMateria(){
        return materia;
    }
    
    public int getNota(){
        return qualifi;
    }
    
    public void setMateria(Materia materia){
        this.materia=materia;
    }
    
    public void setNota(int nuevanota){
        qualifi=nuevanota;
    }
    
}
