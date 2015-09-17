/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weka;

import contraceptiveMethodChoice.Couple;
import java.util.ArrayList;
import weka.core.Instances;

/**
 *
 * @author Lucas
 */

/**
 * 
 * Connection Class for:
 * Interface with Weka Resources
 * Weka Resources with themselves: Creation of .Arff Files and the J48 Algorithm (C4.5)
*/
public class WekaConnection {
    
    private Instances instances;
    
    // receive an ArrayList for Couples and return the J48 Tree
    public void runJ48( ArrayList<Couple> couple ) {
        
        // First step is to create the instances.
        this.createInstances();
        
        
    }
    
    private void createInstances() {
        
    }
    
}
