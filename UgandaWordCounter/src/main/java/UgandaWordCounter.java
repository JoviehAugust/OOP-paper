/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package joviah.ugandawordcounter;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class UgandaWordCounter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book description:");
        String description = scanner.nextLine();

        String lowerDesc = description.toLowerCase();
        String target = "uganda";
        int count = 0;
        int index = 0;

        while ((index = lowerDesc.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }

        System.out.println("The word \"Uganda\" appears " + count + " times in the description.");

        scanner.close();
    }
}

    

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
