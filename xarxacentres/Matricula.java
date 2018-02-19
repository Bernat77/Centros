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
public class Matricula {

    private Alumne alumne;
    private Cicle cicle;
    private Centre centre;
    private String dataMatriculacio;
    private ArrayList<Materia> materias;
    private ArrayList<MateriaQualificacio> qualif;

    public Matricula(String data) {
        dataMatriculacio = data;
        materias = new ArrayList<Materia>();
        qualif = new ArrayList<MateriaQualificacio>();
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public Cicle getCicle() {
        return cicle;
    }

    public void setCicle(Cicle cicle) {
        this.cicle = cicle;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public String getDataMatriculacio() {
        return dataMatriculacio;
    }

    public void setDataMatriculacio(String dataMatriculacio) {
        this.dataMatriculacio = dataMatriculacio;
    }

    public boolean addMateria(Materia materia) {
        for (int i = 0; i < materias.size(); i++) {
            if (materias.get(i) == materia) {
                return false;
            }
        }
        materias.add(materia);
        return true;
    }

    public boolean addQualif(Materia materia, int nota) {
        for (int i = 0; i < qualif.size(); i++) {
            if (qualif.get(i).getMateria() == materia) {
                return false;
            }
        }
        MateriaQualificacio qual = new MateriaQualificacio(materia, nota);
        qualif.add(qual);
        return true;
    }

}
