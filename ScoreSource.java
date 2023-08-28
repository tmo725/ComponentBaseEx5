/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballevent;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ScoreSource {
    ArrayList<ScoreListener> scoreListener;
    public ScoreSource(){
        scoreListener = new ArrayList<>();
    }
    public void addSubscriber(ScoreListener obj){ //register
        scoreListener.add(obj);
    }
    public void setScoreLine(String value){ //get results
        fireScoreEvent(new ScoreEvent(this, value));
    }
    public void fireScoreEvent(ScoreEvent evt){
        for (ScoreListener scoreListeners : scoreListener){
            scoreListeners.scoreChange(evt);
        }
    }
}
