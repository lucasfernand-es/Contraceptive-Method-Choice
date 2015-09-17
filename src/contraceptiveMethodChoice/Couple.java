package contraceptiveMethodChoice;

import java.util.Random;

/**
 *
 * @author Lucas Fernandes
 * Project for Advanced Topics in Artificial Intelligence
 * Case-Based Reasoning
 */

public class Couple {

    /*
        Atribute information can be found in: http://archive.ics.uci.edu/ml/machine-learning-databases/cmc/cmc.names
    */
    
    private int wifeAge; // (numerical)
    private int wifeEducation; // (categorical)  1=low, 2=medium, 3=regular, 4=high
    private int husbandEducation; // (categorical)  1=low, 2=medium, 3=regular, 4=high
    private int numberChildren; // (numerical)
    private boolean wifeReligion; // (binary) 0=Non-Islam (False), 1=Islam (True)
    private boolean wifeWork; // Wife's now working? (binary) 0=Yes (False), 1=No (True)
    private int husbandOccupation; // (integer) [1,...,4]
    private int standardLivingIndex; // Standard-of-living index (categorical)  1=low, 2=medium, 3=regular, 4=high
    private boolean mediaExposure; // Media exposure (binary) 0=Good (False), 1=Not good (True)
    private int contraceptiveMethod; // Contraceptive method used (class attribute) 1=No-use 2=Long-term 3=Short-term
    
    public Couple (int wifeAge, int wifeEducation, int husbandEducation, int numberChildren,
                        boolean wifeReligion, boolean wifeWork, int husbandOccupation,
                        int standardLivingIndex, boolean mediaExposure, int contraceptiveMethod) {
        this.wifeAge = wifeAge;
        this.wifeEducation = wifeEducation;
        this.husbandEducation = husbandEducation;
        this.numberChildren = numberChildren;
        this.wifeReligion = wifeReligion;
        this.wifeWork = wifeWork;
        this.husbandOccupation = husbandOccupation;
        this.standardLivingIndex = standardLivingIndex;
        this.mediaExposure = mediaExposure;
        this.contraceptiveMethod = contraceptiveMethod;
    }
    
    public Couple (int wifeAge, int wifeEducation, int husbandEducation, int numberChildren,
                        boolean wifeReligion, boolean wifeWork, int husbandOccupation,
                        int standardLivingIndex, boolean mediaExposure) {
        this.wifeAge = wifeAge;
        this.wifeEducation = wifeEducation;
        this.husbandEducation = husbandEducation;
        this.numberChildren = numberChildren;
        this.wifeReligion = wifeReligion;
        this.wifeWork = wifeWork;
        this.husbandOccupation = husbandOccupation;
        this.standardLivingIndex = standardLivingIndex;
        this.mediaExposure = mediaExposure;
    }
    // generate random Couple
    public Couple(Random seed) {
        

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive

        
        this.wifeAge = seed.nextInt((90 - 15) + 1) + 15; // Minimun age is 15 and Maximum age is 90
        this.wifeEducation = seed.nextInt(4) + 1; // [1,2,3,4]
        this.husbandEducation = seed.nextInt(4) + 1; // [1,2,3,4]
        this.numberChildren = seed.nextInt((15 - 0) + 1) + 0; // Minimun number of children is 0 and Maximum number of children is 15
        this.wifeReligion = seed.nextBoolean();
        this.wifeWork = seed.nextBoolean();
        this.husbandOccupation = seed.nextInt(4) + 1; // [1,2,3,4]
        this.standardLivingIndex = seed.nextInt(4) + 1; // [1,2,3,4]
        this.mediaExposure = seed.nextBoolean();
        this.contraceptiveMethod = seed.nextInt(3) + 1; // [1,2,3]
    }
     public Couple () {
         
     }
    
    public int getWifeAge() {
        return wifeAge;
    }

    public void setWifeAge(int wifeAge) {
        this.wifeAge = wifeAge;
    }

    public int getWifeEducation() {
        return wifeEducation;
    }

    public void setWifeEducation(int wifeEducation) {
        this.wifeEducation = wifeEducation;
    }

    public int getHusbandEducation() {
        return husbandEducation;
    }

    public void setHusbandEducation(int husbandEducation) {
        this.husbandEducation = husbandEducation;
    }

    public int getNumberChildren() {
        return numberChildren;
    }

    public void setNumberChildren(int numberChildren) {
        this.numberChildren = numberChildren;
    }

    public boolean isWifeReligion() {
        return wifeReligion;
    }

    public void setWifeReligion(boolean wifeReligion) {
        this.wifeReligion = wifeReligion;
    }

    public boolean isWifeWork() {
        return wifeWork;
    }

    public void setWifeWork(boolean wifeWork) {
        this.wifeWork = wifeWork;
    }

    public int getHusbandOccupation() {
        return husbandOccupation;
    }

    public void setHusbandOccupation(int husbandOccupation) {
        this.husbandOccupation = husbandOccupation;
    }

    public int getStandardLivingIndex() {
        return standardLivingIndex;
    }

    public void setStandardLivingIndex(int standardLivingIndex) {
        this.standardLivingIndex = standardLivingIndex;
    }

    public boolean isMediaExposure() {
        return mediaExposure;
    }

    public void setMediaExposure(boolean mediaExposure) {
        this.mediaExposure = mediaExposure;
    }

    public int getContraceptiveMethod() {
        return contraceptiveMethod;
    }

    public void setContraceptiveMethod(int contraceptiveMethod) {
        this.contraceptiveMethod = contraceptiveMethod;
    }
    
    public String showCouple() {
        return this.wifeAge + "," + this.wifeEducation + "," + 
                this.husbandEducation + "," + this.numberChildren + "," + (this.wifeReligion? 1 : 0) + "," + 
                (this.wifeWork? 1 : 0) + "," + this.husbandOccupation + "," + 
                this.standardLivingIndex + "," + (this.mediaExposure? 1 : 0) + "," + this.contraceptiveMethod;
    }
    // compare the number of the equal attributes
    public int compareTo(Couple couple) {
        int equal = 0;
        
        if(this.getWifeAge() == couple.getWifeAge()) equal++;
        if(this.getWifeEducation() == couple.getWifeEducation()) equal++;
        if(this.getHusbandEducation() == couple.getHusbandEducation()) equal++;
        if(this.getNumberChildren() == couple.getNumberChildren()) equal++;
        if(this.isWifeReligion() == couple.isWifeReligion()) equal++;
        if(this.isWifeWork() == couple.isWifeWork()) equal++;
        if(this.getHusbandOccupation() == couple.getHusbandOccupation()) equal++;
        if(this.getStandardLivingIndex() == couple.getStandardLivingIndex()) equal++;
        if(this.isMediaExposure() == couple.isMediaExposure()) equal++;
        
        return equal;
    }
}