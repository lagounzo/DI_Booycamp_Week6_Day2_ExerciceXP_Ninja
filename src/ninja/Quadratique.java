
/**
 * @author N'ZO LAGOU PRIVAT N'GUESSAN
 */


/*
 Exercice 2 : Solutions Fait Ce Quadratique


Instruction
Combien de solutions ce quadratique a-t-il

Une équation quadratique a x² + bx + c = 0 a 0, 1 ou 2 
solutions distinctes pour les valeurs réelles de x. Étant donné a, b et c, vous devez renvoyer le nombre de solutions à l'équation.

Exemples

solutions(1, 0, -1) ➞ 2
// x² - 1 = 0 has two solutions (x = 1 and x = -1).

solutions(1, 0, 0) ➞ 1
// x² = 0 has one solution (x = 0).

solutions(1, 0, 1) ➞ 0
// x² + 1 = 0 has no real solutions.
Remarques
Vous n'avez pas à calculer les solutions, indiquez simplement leur nombre. a sera toujours non nul.
 * 
 * 
 * */

package ninja;

import java.util.Scanner;

public class Quadratique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, delta;
        Scanner writh = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = writh.nextFloat();
        System.out.println("Enter b: ");
        b = writh.nextFloat();
        System.out.println("Enter c: ");
        c = writh.nextFloat();
        writh.close();
//pow pour l'xposant
        delta = Math.pow(b, 2) - (4 * a * c);

        if(delta < 0) {
           System.out.println(a + "x² + " + b + "x + " + c + " = 0 has no real solutions."); 
        } else if(delta == 0) {
            System.out.println(a + "x² + " + b + "x + " + c + " = 0 has one solution."); 
        } else {
            System.out.println(a + " x² + " +b + "x + " + c + " = 0 has two solutions."); 
        }
	}

}
