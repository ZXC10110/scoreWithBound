/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithbound;

import java.util.Scanner;

/**
 *
 * @author kanya
 */
public class ScoreWithBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ScoreBean score = new ScoreBean();
        User01 user01 = new User01();
        User02 user02 = new User02();
        //register
        score.addPropertyChangeListener(user01);
        score.addPropertyChangeListener(user02);
        //update        
        boolean enter = true;
        Scanner sc = new Scanner(System.in);
        try {
            while (enter){
                System.out.print("ENTER SCORE : ");
                String enterScore = sc.nextLine();
                score.setSomeScore(enterScore);
                if (enterScore.equals("")) {
                    score.setSomeScore("End Match");
                    System.exit(0);
                    sc.close();
                }
            }
        } finally {
            if (sc != null) sc.close();
        }
    }
    
}
