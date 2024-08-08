/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg4;
import javax.swing.JOptionPane;
/**
 *
 * @author sebas
 */
public class Estudiantes {
    private String nombreEstudiante;
    private String nombreProfesor;
    private String curso;
    private int calificacion;
    private int maxCalificacion;
    private int minCalificacion;
    private double promedio;
    

    
    public Estudiantes(String nombreEstudiante, String nombreProfesor, String curso, int calificacion, int maxCalificacion, int minCalificacion, double promedio){
            this.nombreEstudiante= nombreEstudiante;
            this.nombreProfesor= nombreProfesor;
            this.curso= curso;
            this.calificacion= calificacion;
            this.maxCalificacion= maxCalificacion;
            this.minCalificacion= minCalificacion;
            this.promedio= promedio;
            }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getMaxCalificacion() {
        return maxCalificacion;
    }

    public void setMaxCalificacion(int maxCalificacion) {
        this.maxCalificacion = maxCalificacion;
    }

    public int getMinCalificacion() {
        return minCalificacion;
    }

    public void setMinCalificacion(int minCalificacion) {
        this.minCalificacion = minCalificacion;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }


    
   
    }

    
    

