/**
 * @param N'ZO LAGOU PRIVAT N'GUESSAN
 */


/**
 * Dans une entreprise, l'efficacité des travailleurs est déterminée sur 
 la base du temps nécessaire à un travailleur pour effectuer un travail particulier.

Si le temps pris par le travailleur est compris entre 2 et 3 heures, on dit que le travailleur est très efficace.

Si le temps requis par le travailleur est compris entre 3 et 4 heures, le travailleur reçoit l'ordre d'améliorer sa vitesse.

Si le temps pris est compris entre 4 et 5 heures, le travailleur reçoit une formation pour 
améliorer sa vitesse et si le temps pris par le travailleur est supérieur à 5 heures, le travailleur doit quitter l'entreprise.

Si le temps pris par le travailleur est saisi au clavier, trouvez l'efficacité du travailleur
 */



package ninja;

import java.util.Scanner;

public class WorkerEfficiency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner writh = new Scanner(System.in);
	        System.out.println("Enter the time required by worker: ");
	        double necessaryTime = writh.nextDouble();
	        writh.close();

	        if(necessaryTime >= 2 && necessaryTime <= 3) {
	            System.out.println("Worker is highly efficient");
	        } else if(necessaryTime <= 4) {
	            System.out.println("Worker Needs to Improve Speed");
	        } else if(necessaryTime <= 5) {
	            System.out.println("Worker needs training to improve speed");
	        } else {
	            System.out.println("Worker has to leave the company");
	        }
	    }
	}


