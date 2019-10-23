/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigbangrockpaperscissorslizardspock;

//import java.util.Date;
import java.util.concurrent.TimeUnit;



/**
 *
 * @author cipherox
 */
public class BigBangRockPaperScissorsLizardSpock {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean game = true;
        
        boolean player1Wins = false; // if a player was not defeated = true
        boolean player2Wins = false;
        boolean player3Wins = false;
        boolean player4Wins = false;
        
        boolean player1Defeated = false; // If the players hand was defeated by another players hand
        boolean player2Defeated = false;
        boolean player3Defeated = false;
        boolean player4Defeated = false;
        
        int round = 1;
        
        int handp1;
        int handp2;
        int handp3;
        int handp4;
        
        int scorep1 = 0;
        int scorep2 = 0;
        int scorep3 = 0;
        int scorep4 = 0;
        
        String winner = "We have a winner!";
        
        Players p1 = new Players();
            p1.Name = "P1";
        Players p2 = new Players();
            p2.Name = "P2";
        Players p3 = new Players();
            p3.Name = "P3";
        Players p4 = new Players();
            p4.Name = "P4";
            
        while (round != 11) {
            System.out.println("Round: " + round);
            
            String posession = "'s";
            String posessionp1 = p1.Name + posession;
            String posessionp2 = p2.Name + posession;
            String possession3 = p3.Name + posession;
            
            
            p1.Hand();
            p2.Hand();
            p3.Hand();
            p4.Hand();

            handp1 = p1.Number;
        //    System.out.println("HANDP1 EQUALS P1.NUMBER = " + p1.Number);
            handp2 = p2.Number;
        //    System.out.println("HANDP1 EQUALS P2.NUMBER = " + p2.Number);
            handp3 = p3.Number;
        //    System.out.println("HANDP1 EQUALS P3.NUMBER = " + p3.Number);
            handp4 = p4.Number;
        //    System.out.println("HANDP1 EQUALS P4.NUMBER = " + p4.Number);
        

            //Defeate Phase! P1(ROCK) 
            if (handp1 == 0) {

                if(handp2 == 1) { //PAPER COVERS ROCK
                    if (player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Rock was coverd with papper by Player 2!");
                        System.out.println("Player 1 has been Defeated!!!");
                    }
                }
                if(handp3 == 1) { 
                    if (player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Rock was coverd with papper by Player 3!");
                        System.out.println("Player 1 has been Defeated!!!");
                    }
                }
                if(handp4 == 1) { 
                    if (player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Rock was coverd with papper by Player 4!");
                        System.out.println("Player 1 has been Defeated!!!");
                    }
                }  // END OF PAPPER

                if(handp2 == 4) { // SPOCK VAPORIZES ROCK
                    if (player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Rock was vaporized by Player 2's Spock!");
                        System.out.println("Player 1 has been Defeated!!!");
                    }
                }   
                if(handp3 == 4) {
                    if (player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Rock was vaporized by Player 3's Spock!");
                        System.out.println("Player 1 has been Defeated!!!");
                    }
                }
                if(handp4 == 4) {
                    if (player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Rock was vaporized by Player 4's Spock!");
                        System.out.println("Player 1 has been Defeated!!!");
                    }

                } // END OF SPOCK
            }
            //Defeate Phase! P2(ROCK) 
            if (handp2 == 0) {

                if(handp1 == 1) { //PAPER COVERS ROCK
                    if (player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Rock was coverd with papper by Player 1!");
                        System.out.println("Player 2 has been Defeated!!!");
                    }
                }
                if(handp3 == 1) { 
                    if (player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Rock was coverd with papper by Player 3!");
                        System.out.println("Player 2 has been Defeated!!!");
                    }
                }
                if(handp4 == 1) { 
                    if (player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Rock was coverd with papper by Player 4!");
                        System.out.println("Player 2 has been Defeated!!!");
                    }
                }  // END OF PAPPER

                if(handp1 == 4) { // SPOCK VAPORIZES ROCK
                    if (player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Rock was vaporized by Player 1's Spock!");
                        System.out.println("Player 2 has been Defeated!!!");
                    }
                }   
                if(handp3 == 4) {
                    if (player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Rock was vaporized by Player 3's Spock!");
                        System.out.println("Player 2 has been Defeated!!!");
                    }
                }
                if(handp4 == 4) {
                    if (player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Rock was vaporized by Player 4's Spock!");
                        System.out.println("Player 2 has been Defeated!!!");
                    }
                } // END OF SPOCK
            }

            //Defeate Phase! P3(ROCK) 
            if (handp3 == 0) {

                if(handp2 == 1) { //PAPER COVERS ROCK
                    if (player3Defeated == false) {
                        player3Defeated = true;
                        System.out.println("Player 3's Rock was coverd with papper by Player 2!");
                        System.out.println("Player 3 has been Defeated!!!");
                    }
                }
                if(handp1 == 1) { 
                    if (player3Defeated == false) {
                        player3Defeated = true;
                        System.out.println("Player 3's Rock was coverd with papper by Player 1!");
                        System.out.println("Player 3 has been Defeated!!!");
                    }
                }
                if(handp4 == 1) {
                    if (player3Defeated == false) {
                        player3Defeated = true;
                        System.out.println("Player 3's Rock was coverd with papper by Player 4!");
                        System.out.println("Player 3 has been Defeated!!!");
                    }
                }  // END OF PAPPER

                if(handp2 == 4) { // SPOCK VAPORIZES ROCK
                    if (player3Defeated == false) {
                        player3Defeated = true;
                        System.out.println("Player 3's Rock was vaporized by Player 2's Spock!");
                        System.out.println("Player 3 has been Defeated!!!");
                    }
                }   
                if(handp1 == 4) {
                    if (player3Defeated == false) {
                        player3Defeated = true;
                        System.out.println("Player 3's Rock was vaporized by Player 1's Spock!");
                        System.out.println("Player 3 has been Defeated!!!");
                    }
                }
                if(handp4 == 4) {
                    if (player3Defeated == false) {
                        player3Defeated = true;
                        System.out.println("Player 3's Rock was vaporized by Player 4's Spock!");
                        System.out.println("Player 3 has been Defeated!!!");
                    }
                } // END OF SPOCK
            } //end of P3 (ROCK)

            //Defeate Phase! P4(ROCK) 
            if (handp4 == 0) {

                if(handp2 == 1) { //PAPPER COVERS ROCK
                    if (player4Defeated == false) {
                        player4Defeated = true;
                        System.out.println("Player 4's Rock was coverd with papper by Player 2!");
                        System.out.println("Player 4 has been Defeated!!!");
                    }
                }
                if(handp3 == 1) {
                    if (player4Defeated == false) {
                        player4Defeated = true;
                        System.out.println("Player 4's Rock was coverd with papper by Player 3!");
                        System.out.println("Player 4 has been Defeated!!!");
                    }
                }
                if(handp1 == 1) { 
                    if (player4Defeated == false) {
                        player4Defeated = true;
                        System.out.println("Player 4's Rock was coverd with papper by Player 1!");
                        System.out.println("Player 4 has been Defeated!!!");
                    }
                } // END OF PAPPER

                if(handp2 == 4) { // SPOCK VAPORIZES ROCK
                    if (player4Defeated == false) {
                        player4Defeated = true;
                        System.out.println("Player 4's Rock was vaporized by Player 2's Spock!");
                        System.out.println("Player 4 has been Defeated!!!");
                    }
                }   
                if(handp3 == 4) {
                    if (player4Defeated == false) {
                        player4Defeated = true;
                        System.out.println("Player 4's Rock was vaporized by Player 3's Spock!");
                        System.out.println("Player 4 has been Defeated!!!");
                    }
                }
                if(handp1 == 4) {
                    if (player4Defeated == false) {
                        player4Defeated = true;
                        System.out.println("Player 4's Rock was vaporized by Player 1's Spock!");
                        System.out.println("Player 4 has been Defeated!!!");
                    }
                } // END OF SPOCK

            } // END OF P4(ROCK)

        //Defeate Phase! P1(PAPER) 
            if (handp1 == 1) {
                if (handp2 == 2) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Papper has been cut by Player 2's Scissors!");
                        System.out.println("Player 1 has been defeated!!!");
                    }
                }
                if (handp3 == 2) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Papper has been cut by Player 3's Scissors!");
                        System.out.println("Player 1 has been defeated!!!");
                    }
                }
                if (handp4 == 2) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Papper has been cut by Player 4's Scissors!");
                        System.out.println("Player 1 has been defeated!!!");
                    }
                }

                if (handp2 == 3) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Papper was eaten by Player 2's Lizard!");
                        System.out.println("Player 1 has been defeated!!!");
                    }
                }
                if (handp3 == 2) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Papper was eaten by Player 3's Lizard!");
                        System.out.println("Player 1 has been defeated!!!");
                    }
                }
                if (handp4 == 2) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 1's Papper was eaten by Player 4's Lizard!");
                        System.out.println("Player 1 has been defeated!!!");
                    }
                }
            }// END OF P1(PAPPER)

            if (handp2 == 1) {
                if (handp1 == 2) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Papper has been cut by Player 1's Scissors!");
                        System.out.println("Player 2 has been defeated!!!");
                    }
                }
                if (handp3 == 2) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Papper has been cut by Player 3's Scissors!");
                        System.out.println("Player 2 has been defeated!!!");
                    }
                }
                if (handp4 == 2) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Papper has been cut by Player 4's Scissors!");
                        System.out.println("Player 2 has been defeated!!!");
                    }
                }
                if (handp1 == 3) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Papper was eaten by Player 1's Lizard!");
                        System.out.println("Player 2 has been defeated!!!");
                    }
                }
                if (handp3 == 2) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Papper was eaten by Player 3's Lizard!");
                        System.out.println("Player 2 has been defeated!!!");
                    }
                }
                if (handp4 == 2) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 2's Papper was eaten by Player 4's Lizard!");
                        System.out.println("Player 2 has been defeated!!!");
                    }
                }
            } // END OF P2(PAPPER)
            
            if (handp3 == 1) {
                if (handp1 == 2) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 3's Papper has been cut by Player 1's Scissors!");
                        System.out.println("Player 3 has been defeated!!!");
                    }
                }
                if (handp2 == 2) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 3's Papper has been cut by Player 2's Scissors!");
                        System.out.println("Player 3 has been defeated!!!");
                    }
                }
                if (handp4 == 2) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 3's Papper has been cut by Player 4's Scissors!");
                        System.out.println("Player 3 has been defeated!!!");
                    }
                }

                if (handp1 == 3) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 3's Papper was eaten by Player 1's Lizard!");
                        System.out.println("Player 3 has been defeated!!!");
                    }
                }
                if (handp2 == 2) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 3's Papper was eaten by Player 2's Lizard!");
                        System.out.println("Player 3 has been defeated!!!");
                    }
                }
                if (handp4 == 2) {
                    if(player1Defeated == false) {
                        player1Defeated = true;
                        System.out.println("Player 3's Papper was eaten by Player 4's Lizard!");
                        System.out.println("Player 3 has been defeated!!!");
                    }
                }
            }// END OF P3(PAPPER)

            if (handp4 == 1) {
                if (handp1 == 2) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 4's Papper has been cut by Player 1's Scissors!");
                        System.out.println("Player 4 has been defeated!!!");
                    }
                }
                if (handp2 == 2) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 4's Papper has been cut by Player 3's Scissors!");
                        System.out.println("Player 4 has been defeated!!!");
                    }
                }
                if (handp3 == 2) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 4's Papper has been cut by Player 4's Scissors!");
                        System.out.println("Player 4 has been defeated!!!");
                    }
                }

                if (handp1 == 3) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 4's Papper was eaten by Player 1's Lizard!");
                        System.out.println("Player 4 has been defeated!!!");
                    }
                }
                if (handp2 == 2) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 4's Papper was eaten by Player 3's Lizard!");
                        System.out.println("Player 4 has been defeated!!!");
                    }
                }
                if (handp3 == 2) {
                    if(player2Defeated == false) {
                        player2Defeated = true;
                        System.out.println("Player 4's Papper was eaten by Player 4's Lizard!");
                        System.out.println("Player 4 has been defeated!!!");
                    }
                }
            } // END OF P4(PAPPER)
            
            System.out.println(" ");
            
            
            
            if(player1Defeated == false) {
                scorep1 = scorep1 + 1;
                System.out.println("P1: SURVIVED!");
            }
            if(player2Defeated == false) {
                scorep2 = scorep2 + 1;
                System.out.println("P2: SURVIVED!");
            }
            if(player3Defeated == false) {
                scorep3 = scorep3 + 1;
                System.out.println("P3: SURVIVED!");
            }
            if(player4Defeated == false) {
                scorep4 = scorep4 + 1;
                System.out.println("P4: SURVIVED!");
            }
            
            round = round + 1;
            
            System.out.println("-----------------");
            System.out.println(" ");
            
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
        
        } // END OF (round != 11) 
        
        System.out.println("-------------------------");
            System.out.println("Rounds Players Survived!:");
                System.out.println("P1 = " + scorep1);
                System.out.println("P2 = " + scorep2);
                System.out.println("P3 = " + scorep3);
                System.out.println("P4 = " + scorep4);
        
        System.out.println("-------------------------");       
            System.out.println(winner);
                if (scorep1 > (scorep2 | scorep3 | scorep4) ) {
                    System.out.println("Player 1 Wins!");
                } else if (scorep2 > (scorep1 | scorep3 | scorep4) ) {
                    System.out.println("Player 2 Wins!");
                } else if (scorep3 > (scorep1 | scorep2 | scorep4) ) {
                    System.out.println("Player 3 Wins!");
                } else if (scorep4 > (scorep1 | scorep2 | scorep3) ) {
                    System.out.println("Player 4 Wins!");
                }
                System.out.println("-------------------------");
                
    } // END OF MAIN

} // END OF CLASS
