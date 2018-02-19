/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xarxacentres;
import java.util.ArrayList;

/**
 *
 * @author Bernat2
 */
public class Cicle {
    private String denominacio;
    private int maxNivell;
    private ArrayList<Materia> materias;
    private XarxaCentres xarxa;
    
    
    public Cicle(String denominacio,int maxNivell){
        materias = new ArrayList<Materia>();
        this.denominacio=denominacio;
        this.maxNivell=maxNivell;       
    }
    
    
    public boolean crearMateria(String nom,int nivell){
        for(int i = 0;i<materias.size();i++){
            if(materias.get(i).getDenominacio()==nom
                    && materias.get(i).getNivell()==nivell){
                return false;
            }
        }
        Materia materia = new Materia(nom,nivell);
        materias.add(materia);
        return true;
    }
    
    
    
}
    
}
