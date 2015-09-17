/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraceptiveMethodChoice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Lucas
 */
public class CoupleData {
    
    private ArrayList listCouple = new ArrayList();
    private File currentFile = null; // Current Data File
    
    
    /*public static void main(String[] args){
        CoupleData test = new CoupleData();
        test.setCurrentFile();
        test.setListCouple( test.readCoupleData() );
        
        test.showData(); 
   }*/
    public ArrayList<Couple> getListCouple() {
        return listCouple;
    }

    public void setListCouple(ArrayList<Couple> listCouple) {
        this.listCouple = listCouple;
    }

    public File getCurrentFile() {
        return currentFile;
    }
    
    public boolean setCurrentFile() {
        /*
        *   Choose a file with the data about the couples.
        */
        // initialize the fileChooser in the current folder
        JFileChooser fileChooser = new JFileChooser(".");
        
        if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            
            // get the file selected
            currentFile = fileChooser.getSelectedFile();
            
            System.out.println("File Selected");
            return true;
        }
        else {
            System.out.println("No File Selected");
            return false;
        }
    }
    
    /*
    *   readData() reads the file and transforms each line in a object.
    */
    public ArrayList<Couple> readCoupleData() {
        
        try {
            ArrayList<Couple> coupleData = new ArrayList<>();
            try (Scanner input = new Scanner(this.getCurrentFile())) {
                String currentLine;
                String[] currentLineSplit;
                
                // Instance's Data
                Couple couple;
                
                int wifeAge;
                short wifeEducation;
                short husbandEducation;
                int numberChildren;
                boolean wifeReligion;
                boolean wifeWork;
                short husbandOccupation;
                short standardLivingIndex;
                boolean mediaExposure;
                short contraceptiveMethod;
                
                while(input.hasNext())
                {
                    currentLine = input.nextLine();
                    //System.out.println(currentLine);
                    
                    currentLineSplit = currentLine.split(",");
                    
                    wifeAge =               Integer.parseInt(currentLineSplit[0]);
                    wifeEducation =         Short.parseShort(currentLineSplit[1]);
                    husbandEducation =      Short.parseShort(currentLineSplit[2]);
                    numberChildren =        Integer.parseInt(currentLineSplit[3]);
                    wifeReligion =          this.verifyString(currentLineSplit[4]);//Boolean.parseBoolean(currentLineSplit[4]);
                    wifeWork =              this.verifyString(currentLineSplit[5]);
                    husbandOccupation =     Short.parseShort(currentLineSplit[6]);
                    standardLivingIndex =   Short.parseShort(currentLineSplit[7]);
                    mediaExposure =         this.verifyString(currentLineSplit[8]);
                    contraceptiveMethod =   Short.parseShort(currentLineSplit[9]);
                    
                    couple = new Couple(wifeAge, wifeEducation, husbandEducation, numberChildren,
                            wifeReligion, wifeWork, husbandOccupation,
                            standardLivingIndex, mediaExposure, contraceptiveMethod);
                    
                    coupleData.add(couple);
                }
            }
            return coupleData;
        }
        catch(FileNotFoundException e){
            System.out.println(e);
            return null;
        }
    }
    // verify the String to decide if it is true or false
    private boolean verifyString(String e) {
        int n = Integer.parseInt(e);
        return n == 1;
        
    }
    public void showData() {
        
    }


}

