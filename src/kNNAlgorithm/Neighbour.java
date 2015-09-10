package kNNAlgorithm;

import contraceptiveMethodChoice.Couple;

/**
 *
 * @author Lucas
 */


// This algorithm will be as generic as possible
class Neighbour {
    
    // item is the data
    private Couple neighbour;
    private float similarity;
    
    public Neighbour () {
        
    }
    
    public Neighbour(Couple neighbour) {
        this.neighbour = neighbour;
    }
    
    public Neighbour(Couple neighbour, Couple point) {
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
        return "\t s: " + this.similarity;
    }
    
    public boolean compareTo(Neighbour neighbour) {
        
            float d1 = 1 - this.getSimilarity();
            float d2 = 1 - neighbour.getSimilarity();
            if ( d1 < d2 ) {
                return true;
            }
            else {
                return false;
            }
    }
    /*public static void main(String[] args) {
        Neighbour n;
        short one = 1;
        short two = 2; 
        Couple couple = new Couple(45, one, one, 4, false, true, one, one, false);
        Couple couple2 = new Couple(50, two, two, 4, true, false, two, two, false);
        
        n = new Neighbour(couple, couple2);
        System.out.println("s: " + n.getSimilarity());
        
    }*/
    
}
