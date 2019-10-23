/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbangrockpaperscissorslizardspock;

/**
 *
 * @author cipherox
 */
public class Players {
    
    int Number = 0;
    String Name;
    String RPSLS = "Rock, Paper, Scissors, Lizard, Spock!: ";
    String Move = "Rock"; //default hand
    boolean Victory = false;
    
    void Hand() {
        Number = (int) (Math.random() * 10); //Randomize this number from 0 to 10
        
        while (Number > 4) { // Loop, until the number is either 4 or below
            Number = (int) (Math.random() * 10);
        }
        
        switch(Number) { //Compare Number to the possible hand moves
            case 0: Move = "Rock";
                    System.out.println(RPSLS + Name + "(" + Move + ")." );
                    break;
            case 1: Move = "Papper";
                    System.out.println(RPSLS + Name + "(" + Move + ")." );
                    break;
            case 2: Move = "Sciccors";
                    System.out.println(RPSLS + Name + "(" + Move + ")." );
                    break;
            case 3: Move = "Lizard";
                    System.out.println(RPSLS + Name + "(" + Move + ")." );
                    break;
            case 4: Move = "Spock";
                    System.out.println(RPSLS + Name + "(" + Move + ")." );
                    break;
            default:    Move = "Rock";
                        System.out.println(RPSLS + Name + "(" + Move + ")." );
                        break;
        }
            
        /*
        if (Number == 0) {
            Move = "Rock";
            System.out.println("Rocker, Paper, Sciccors, Lizard, Spock!: " + "(" + Move + ")." );
        } else if (Number == 1) { // else 1
            Move = "Papper";
            System.out.println("Rocker, Paper, Sciccors, Lizard, Spock!: " + "(" + Move + ")." );
        } else if (Number == 2) { // else 2
            Move = "Sciccors";
            System.out.println("Rocker, Paper, Sciccors, Lizard, Spock!: " + "(" + Move + ")." );
        } else if (Number == 3) { // else 3
            Move = "Lizard";
            System.out.println("Rocker, Paper, Sciccors, Lizard, Spock!: " + "(" + Move + ")." );
        } else if (Number == 4) {
            Move = "Spock";
            System.out.println("Rocker, Paper, Sciccors, Lizard, Spock!: " + "(" + Move + ")." );
        } // else 4
        */
    } //end of Hand()
    
    
}
