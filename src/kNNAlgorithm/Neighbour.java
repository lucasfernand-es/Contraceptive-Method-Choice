package kNNAlgorithm;

import contraceptiveMethodChoice.Couple;

/**
 *
 * @author Lucas
 */


// This algorithm will be as generic as possible
public class Neighbour {
    
    // item is the data
    private int index;
    private Couple neighbour;
    private float similarity;
    
    public Neighbour () {
        
    }
    
    public Neighbour(int index, Couple neighbour, Couple point) {
        this.index = index;
        this.neighbour = neighbour;
        this.calcSimilarity(point);
    }
    
    public Couple getNeighbour() {
        return neighbour;
    }

    public float getSimilarity() {
        return similarity;
    }
    
    /* 
    *   calculate the similatiry between two items: Point is the object which needs classification
    */
    private void calcSimilarity(Couple point) {
        /*
        *   the similarity function will be determined by the number of equal attributes
        *   similarity(point, neighbour) = e/n,
        *   where e is the number of equal attributes and n the total number of attributes
        */
        
        Couple pointCouple = point;
        Couple neighbourCouple = this.getNeighbour();
        
        float e = pointCouple.compareTo(neighbourCouple);
        //System.out.println("e: " + e);
        float n = pointCouple.getClass().getDeclaredFields().length - 1; // Class is one of the attributes
        //System.out.println("n: " + n);
        
        this.similarity = (e/n);

    }
    
    public String showNeighbour() {
        // return this.neighbour.showCouple() + "\t s: " + this.similarity;
        return "\t" + this.index + "\t" + this.neighbour.showCouple() +"\ts: " + this.similarity;
    }
    
    public float distance(){
        return 1 - this.similarity;
    }
    
    public int getIndex() {
        return index;
    }
    
}
