
package org.easycode.sistema;

/**
 *
 * @author programacion
 */
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.easycode.dao.EstudianteJpaController;
import org.easycode.dao.exceptions.NonexistentEntityException;
import org.easycode.dominio.Estudiante;

/**
 *
 * @author programacion
 */
public class Principal {
    private static Scanner sc = new Scanner(System.in);
    private static Scanner sestudiante = new Scanner(System.in);
    private static Estudiante e;
    private static EstudianteJpaController estudianteDao = new EstudianteJpaController();
    private static int op, id;
    
    public static void main(String[] args) {
        System.out.println("¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦"); 
        System.out.println("*****  -Menu de Opciones-  *****");   			       
        System.out.println("---------------------------------------------");
        System.out.println("-1.> Mostrar estudiantes por Código");
        System.out.println("-2.> Agregar estudiante al SGBD ---");
        System.out.println("-3.> Actualizar una tupla -------------");
        System.out.println("-4.> Eliminar una tupla ---------------");
        System.out.println("-5.> Listar Personas -------------------");
        System.out.println("-6.> Salir --------------------------------");
        System.out.println("--------------------------------------------");
        System.out.println("Ingrese una opcion a realizar...");
        op = sc.nextInt();
        
        do{
        switch(op){
	case 1:
		 e = obtenerEstudiante();
         System.out.println(e);
	break;
	case 2:
		 e = getEstudiante();
         if(estudianteDao.agregarEstudiante(e)){
            System.out.println("Se agregó a la estudiante con éxito");
         }else
            System.out.println("No se pudo agregar al nuevo estudiante");
         break;
	case 3:
		  e = obtenerEstudiante();
          System.out.println(e);
          System.out.println("Ingrese el nombre, el apellido, la edad, la fecha de nacimiento, la carrera , el código técnico y código acádemico nuevos del estudiante ");
          e = new Estudiante (id,sestudiante.nextLine(),sestudiante.nextLine(),sestudiante.nextLine(),sestudiante.nextLine(),sestudiante.nextLine(),sestudiante.nextLine(),sestudiante.nextLine());
        
          try {
            estudianteDao.editarEstudiante(e);
          } catch (Exception ex) {
            System.out.println("No se puede actualizar el registro");
          }
	break;
        case 4:
            e = obtenerEstudiante();
                System.out.println("¿Está seguro de eliminar el siguiente estudiante?");
                System.out.println(e);
        
                try {
                    estudianteDao.eliminarEstudiante(id);
                    System.out.println("Registro eliminado exitosamente!");
                } catch (NonexistentEntityException ex) {
                    System.out.println("No se puede eliminar el registro");
                }
        
                break;
        case 5:
            List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
                for(Iterator<Estudiante> iterator = estudiantes.iterator();iterator.hasNext();){
                    Estudiante next = iterator.next();
                    System.out.println(next);
                }
                break;
            default:
                  System.out.println("No es una opción del Menú...");  
        break;
        }
            System.out.println("¿Desea volver al menú?");
            System.out.println("1. Si");
            System.out.println("2. No");
            op = sc.nextInt();
        }while(op == 1);
    }
    
    private static Estudiante obtenerEstudiante(){
	System.out.println("Ingrese el código del alumno");
	id = sc.nextInt();
	e = estudianteDao.buscarEstudiante(id);
	return e;
}

    private static Estudiante getEstudiante(){
            System.out.println("Ingrese el código,el nombre, el apellido, la edad, la fecha de nacimiento, la carrera, el código técnico y código acádemico del estudiante ");
            Estudiante e = new Estudiante(sc.nextInt(),sestudiante.nextLine(),sestudiante.nextLine(),sestudiante.nextLine(),sestudiante.nextLine(),sestudiante.nextLine(),sestudiante.nextLine(),sestudiante.nextLine());
            return e;
    }
}
