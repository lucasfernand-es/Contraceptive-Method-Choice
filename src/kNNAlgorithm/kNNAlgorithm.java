package kNNAlgorithm;

import contraceptiveMethodChoice.Couple;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Lucas
 */

// kNN Algorithm
public class kNNAlgorithm {
    // array with the list of neighbours
    private ArrayList<Neighbour> neighbourhood = new ArrayList<Neighbour>();
    // main point of the kNN
    private Couple point;
    
    public kNNAlgorithm() {
        
    }
    
    public kNNAlgorithm(ArrayList<Couple> listCouple, Couple point) {
        this.point = point;
        // call the function createNeighbourhood to create a Neighbourhood based in a point
        this.createNeighbourhood(listCouple);
    }
    
    // a list of the neighbourhoob is created given a point
    private void createNeighbourhood(ArrayList<Couple> listCouple){
        
        for(Couple couple: listCouple) {
            Neighbour neighbour = new Neighbour(couple, this.point);
            this.neighbourhood.add(neighbour);
        }        
    }
    
    public void showNeighbourhood() {
        for (Neighbour neighbour: this.neighbourhood) {
            System.out.println(neighbour.showNeighbour());
        }
    }
    
    public ArrayList<Neighbour> getNeighbourhood(){
        return this.neighbourhood;
    }
    
}
