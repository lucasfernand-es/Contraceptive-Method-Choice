/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraceptive.method.choice;

/**
 *
 * @author Lucas
 */



public class Couple {

    /*
    1 Wife's age (numerical)
    2 Wife's education (ordenado) 1=low, 2=medium, 3=regular, 4=high
    3 Husband's education (ordenado) 1=low, 2=medium, 3=regular, 4=high
    4 Number of children ever born (numerical)
    5 Wife's religion (binary) 0=Non-Islam, 1=Islam
    6 Wife's now working? (binary) 0=Yes, 1=No
    7 Husband's occupation (inteiro) [1,...,4]
    8 Standard-of-living index (ordenado) 1=low, 2=medium, 3=regular, 4=high
    9 Media exposure (binary) 0=Good, 1=Not good
    10 Contraceptive method used (não-ordenado) 1=No-use 2=Long-term 3=Short-term
    */
    
    int wifeAge; // Wife's age (numerical)
    short wifeEducation; // 1=low, 2=medium, 3=regular, 4=high
    short husbandEducation; // 1=low, 2=medium, 3=regular, 4=high
    int numberChildren; // Number of children ever born (numerical)
    boolean wifeReligion; // (binary) 0=Non-Islam (False), 1=Islam (True)
    boolean wifeWork; // Wife's now working? (binary) 0=Yes (False), 1=No (True) Obs.: I wasn' responsible to decide that yes is 0
    short husbandOccupation; // Husband's occupation (integer) [1,...,4]
    short standardLivingIndex ; // Standard-of-living index (ordered) 1=low, 2=medium, 3=regular, 4=high
    
}
