
package org.easycode.sistema;

/**
 *
 * @author programacion
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦"); 
        System.out.println("*****  -Menu de Opciones-  *****");   			         System.out.println("¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦"); 
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

    }
}
