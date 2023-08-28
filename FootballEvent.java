/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package footballevent;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class FootballEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ScoreSource score = new ScoreSource();
        Subscriber somsri = new Subscriber();
        Subscriber somchai = new Subscriber();
        score.addSubscriber(somsri);
        score.addSubscriber(somchai);
        
        while(true){
            System.out.print("Enter Score = ");
            String enter = input.nextLine();
            
            if(enter.equals("")){
                break;
            }
            else{
                score.setScoreLine(enter);
            }
        }
    }
    
}
