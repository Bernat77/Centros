/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xarxacentres;
import java.util.*;
/**
 *
 * @author Bernat2
 */
public class Centre {
    private XarxaCentres xarxa;
    private String denominacio;
    private String adreca;    
    private ArrayList<Matricula> matriculas;
    private ArrayList<Cicle> cicles;
    
    public Centre(String denominacio,String adreca){
        this.denominacio=denominacio;
        this.adreca=adreca;
        matriculas=new ArrayList<Matricula>();
        cicles=new ArrayList<Cicle>();
    }
    
    
    
    
}
