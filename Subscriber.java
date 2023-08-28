/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballevent;

/**
 *
 * @author USER
 */
public class Subscriber implements ScoreListener {

    @Override
    public void scoreChange(ScoreEvent evt) {
        System.out.println("(subscriber) score is update to " +
                evt.getScore());
    }
    
}
