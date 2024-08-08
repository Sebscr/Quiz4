/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiantes [] arrEstudiantes = new Estudiantes [3];

        for (int i=0; i < 3; i++){
            String nombreEstudiante = JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante: ");
            String nombreProfesor = JOptionPane.showInputDialog(null,"Ingrese el nombre del profesor: ");
            String curso = JOptionPane.showInputDialog(null,"Ingrese el nombre del curso: ");
            int calificacion= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la calificacion del estudiante: "));
            int maxCalificacion= Integer.MAX_VALUE;
            int minCalificacion= Integer.MIN_VALUE;
            double promedio = calificacion / (3);
            arrEstudiantes [i]= new Estudiantes (nombreEstudiante, nombreProfesor, curso, calificacion, maxCalificacion, minCalificacion, promedio ); 
            
        }
        Estudiantes resultado = arrEstudiantes[0];
        JOptionPane.showMessageDialog(null,
            "Los Estudiantes \"" + resultado.getNombreEstudiante()+ 
            "• Obtuvieron las siguientes calificaciones " + resultado.getCalificacion() +
            "• El promedio es de: " + resultado.getPromedio() + "\n"+
            "• El promedio mas alto es de: " + resultado.getMaxCalificacion() + "\n" +
            "• El poromedio mas bajo es de: " + resultado.getMinCalificacion()
        );
        }

        
 
        }

