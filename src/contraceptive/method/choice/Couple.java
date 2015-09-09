package contraceptive.method.choice;

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
    private short wifeEducation; // (categorical)  1=low, 2=medium, 3=regular, 4=high
    private short husbandEducation; // (categorical)  1=low, 2=medium, 3=regular, 4=high
    private int numberChildren; // (numerical)
    private boolean wifeReligion; // (binary) 0=Non-Islam (False), 1=Islam (True)
    private boolean wifeWork; // Wife's now working? (binary) 0=Yes (False), 1=No (True)
    private short husbandOccupation; // (integer) [1,...,4]
    private short standardLivingIndex; // Standard-of-living index (categorical)  1=low, 2=medium, 3=regular, 4=high
    private boolean mediaExposure; // Media exposure (binary) 0=Good (False), 1=Not good (True)
    private short contraceptiveMethod; // Contraceptive method used (não-ordenado)/(class attribute) 1=No-use 2=Long-term 3=Short-term
    
    public Couple (int wifeAge, short wifeEducation, short husbandEducation, int numberChildren,
                        boolean wifeReligion, boolean wifeWork, short husbandOccupation,
                        short standardLivingIndex, boolean mediaExposure, short contraceptiveMethod) {
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

    public String showCouple() {
        return this.wifeAge + "," + this.wifeEducation + "," + 
                this.husbandEducation + "," + this.numberChildren + "," + (this.wifeReligion? 1 : 0) + "," + 
                (this.wifeWork? 1 : 0) + "," + this.husbandOccupation + "," + 
                this.standardLivingIndex + "," + (this.mediaExposure? 1 : 0) + "," + this.contraceptiveMethod;
    }
    
    public int getWifeAge() {
        return wifeAge;
    }

    public void setWifeAge(int wifeAge) {
        this.wifeAge = wifeAge;
    }

    public short getWifeEducation() {
        return wifeEducation;
    }

    public void setWifeEducation(short wifeEducation) {
        this.wifeEducation = wifeEducation;
    }

    public short getHusbandEducation() {
        return husbandEducation;
    }

    public void setHusbandEducation(short husbandEducation) {
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

    public short getHusbandOccupation() {
        return husbandOccupation;
    }

    public void setHusbandOccupation(short husbandOccupation) {
        this.husbandOccupation = husbandOccupation;
    }

    public short getStandardLivingIndex() {
        return standardLivingIndex;
    }

    public void setStandardLivingIndex(short standardLivingIndex) {
        this.standardLivingIndex = standardLivingIndex;
    }

    public boolean isMediaExposure() {
        return mediaExposure;
    }

    public void setMediaExposure(boolean mediaExposure) {
        this.mediaExposure = mediaExposure;
    }

    public short getContraceptiveMethod() {
        return contraceptiveMethod;
    }

    public void setContraceptiveMethod(short contraceptiveMethod) {
        this.contraceptiveMethod = contraceptiveMethod;
    }
}