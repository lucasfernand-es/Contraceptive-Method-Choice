package kNNAlgorithm;

import contraceptiveMethodChoice.Couple;
import java.util.ArrayList;
import utility.QuickSort;

/**
 *
 * @author Lucas
 */

// kNN Algorithm
public class kNNAlgorithm {
    // array with the list of neighbours
    private ArrayList<Neighbour> neighbourhood = new ArrayList<>();
    // main point of the kNN
    private Couple point;
    // minimun of similarity required
    private int minSimilarity;
    // time of execution
    private long timeSequencial = 0;
    private long time2Level = 0;
    
    
    public kNNAlgorithm() {
        
    }
    
    public kNNAlgorithm(ArrayList<Couple> listCouple, Couple point) {
        this.point = point;
        this.minSimilarity = 0;
    }
    
    public kNNAlgorithm(ArrayList<Couple> listCouple, Couple point, int minSimilarity) {
        this.point = point;
        this.minSimilarity = minSimilarity;
    }
    
    // a list of the neighbourhoob is created given a point
    public void createNeighbourhood(ArrayList<Couple> listCouple){
        // Always measure the time
        long startTime = System.nanoTime();
        
        float accept = (float) this.minSimilarity/100;
        // index to each couple
        int index = 0;
       
        // not using functional
        for(Couple couple: listCouple) {
            Neighbour neighbour = new Neighbour(index, couple, this.getPoint());
            if(neighbour.getSimilarity() >= accept)
                this.neighbourhood.add(neighbour);
            index++;
        }     
        // sort the neighbourhood
        QuickSort quick = new QuickSort();
        quick.sort(this.neighbourhood);
        
        
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);  
        if (accept == 0)
            this.timeSequencial = duration;
        else
            this.time2Level = duration;
    }
    
    public void showNeighbourhood() {
        
        System.out.println("Neighbourhood:\n\t->");
        for (Neighbour neighbour: this.neighbourhood) {
            System.out.println(neighbour.showNeighbour());
        }
    }
    
    public ArrayList<Neighbour> getNeighbourhood(){
        return this.neighbourhood;
    }
    
    public ArrayList<Neighbour> getKNN (int k) {
        ArrayList<Neighbour> kFirst = new ArrayList<> ( this.neighbourhood.subList(0, k) );
        
        return kFirst;
    }

    public long getTimeSequencial() {
        return timeSequencial;
    }

    public long getTime2Level() {
        return time2Level;
    }
    
    public int getMinSimilarity() {
        return this.minSimilarity;
    }
    
    public void setMinSimilarity(int minSimilarity) {
        this.minSimilarity = minSimilarity;
    }
 
   public Couple getPoint() {
        return point;
    }

    public void setPoint(Couple point) {
        this.point = point;
    }
    
}
