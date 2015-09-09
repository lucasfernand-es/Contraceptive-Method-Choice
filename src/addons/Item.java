/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addons;

/**
 *
 * @author Lucas
 */
public class Item {
    private int value;
    private String label;

    public Item(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public String toString() {
        return getLabel();
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }
}