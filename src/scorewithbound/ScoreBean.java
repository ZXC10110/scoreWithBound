/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithbound;

import java.beans.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author kanya
 */
public class ScoreBean implements Serializable {
    
    public static final String SOME_SCORE = "someScoe";
    
    private String someScore;
    
    private PropertyChangeSupport propertySupport;
    
    public ScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSomeScore() {
        return someScore;
    }
    
    public void setSomeScore(String value) {
        String oldValue = someScore;
        someScore = value;
        propertySupport.firePropertyChange(SOME_SCORE, oldValue, someScore);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
