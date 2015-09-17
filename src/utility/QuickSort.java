/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *   Lars Vogel
 *   Version 0.6
 *   Copyright © 2009 -2010 vogella GmbH 
 *   Adapted by Lucas Fernandes
 */
package utility;

import java.util.ArrayList;
import kNNAlgorithm.Neighbour;

/**
 *
 * @author Lucas
 */
public class QuickSort  {
    private ArrayList<Neighbour> neighbourhood;
    private int nhSize;

    public void sort(ArrayList<Neighbour> neighbourhood) {
      // check for empty or null array list
      if (neighbourhood == null || neighbourhood.isEmpty()){
        return;
      }
      
      this.neighbourhood = neighbourhood;
      this.nhSize = this.neighbourhood.size();
      quickSort(0, nhSize - 1);
    }

    private void quickSort(int low, int high) {
      int i = low, j = high;
      // Get the pivot element from the middle of the list
      //int pivot = numbers[low + (high-low)/2];
      Neighbour pivot = this.neighbourhood.get( low + (high-low)/2 );

      // Divide into two lists
      while (i <= j) {
        // If the current value from the left list is smaller then the pivot
        // element then get the next element from the left list
        while (this.neighbourhood.get(i).distance() < pivot.distance() ) {
          i++;
        }
        // If the current value from the right list is larger then the pivot
        // element then get the next element from the right list
        while (this.neighbourhood.get(j).distance()  > pivot.distance() ) {
          j--;
        }

        // If we have found a values in the left list which is larger then
        // the pivot element and if we have found a value in the right list
        // which is smaller then the pivot element then we exchange the
        // values.
        // As we are done we can increase i and j
        if (i <= j) {
          exchange(i, j);
          i++;
          j--;
        }
      }
      // Recursion
      if (low < j)
        quickSort(low, j);
      if (i < high)
        quickSort(i, high);
    }

    private void exchange(int i, int j) {
      Neighbour temp = this.neighbourhood.get(i);
      this.neighbourhood.set(i, this.neighbourhood.get(j));
      this.neighbourhood.set(j, temp);
    }
    public ArrayList<Neighbour> getNeighbourhood(){
        return this.neighbourhood;
    }
}
