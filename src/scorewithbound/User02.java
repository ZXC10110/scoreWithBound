/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithbound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author kanya
 */
public class User02 implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        System.out.println("(USER_02) Current's Score : " + pce.getNewValue());
    }
    
}
