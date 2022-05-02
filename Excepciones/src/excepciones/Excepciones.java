/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int c = a + b;

            if (a + b == 10) {
                Scanner sc = new Scanner(new File("asdasd"));
            }

            if (a + b != 10) {
                throw new CustomExceptionHija("Custom Exception Hija");
            }

            int vec[] = new int[5];
            vec[10] = 10;
            if (false) {
                throw new RuntimeException("Runtime exception");
            }
            int div = a / b;
            System.out.println(div);
        } catch (CustomExceptionHija ceh) {
            System.out.println("CATCH - CustomExceptionHija: " + ceh.getMessage());
        } catch (CustomException ce) {
            System.out.println("CATCH - CustomException: " + ce.getMessage());
        } catch (IOException ioe) {
            System.out.println("CATCH - IOException: " + ioe.getMessage());
        } catch (RuntimeException re) {
            System.out.println("CATCH - RuntimeException: " + re.getMessage());
        } catch (Exception e) {
            System.out.println("CATCH - Exception: " + e.getMessage());
        } finally {
            System.out.println("FINALLY: Pero al final no paso nada");
        }

        System.out.println("Sigue el programa....");
    }

}
