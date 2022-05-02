/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.io.IOException;

/**
 *
 * @author User
 */
public class Clase2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        // Scanner sc = new Scanner(new File("asdasd"));
        //int c = a / b;
        try {
            //System.out.println(a / b);

            if (a == 10) {
                throw new RuntimeException("A es 10");
            }
            
            if (a == 10) {
                throw new ExcepcionPersonalizada("A es 10");
            }

        } catch (Exception e) {
            System.out.println("Hubo un error: " + e);
        }

        System.out.println("Seguia haciendo otra cosa");

    }

}
