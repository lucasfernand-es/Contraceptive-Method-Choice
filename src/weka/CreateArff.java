package weka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import weka.core.*;



/**
 *
 * @author Lucas
 */

// Create Arff file for Couple Object
public class CreateArff {
    
    FastVector attributes;
    Instances instances;
    
    private void createAttributes() {
        // Creating attributes
        
        // Example of nominal attribute
        // {1,2,3,4}
	FastVector categorical = new FastVector(4);
	categorical.addElement("1");
	categorical.addElement("2");
	categorical.addElement("3");
	categorical.addElement("4");
        
        // {0,1}
        FastVector binary = new FastVector(2);
	binary.addElement("1");
	binary.addElement("0");
        
        // {1,2,3}
        FastVector classification = new FastVector(2);
	classification.addElement("1");
	classification.addElement("2");
	classification.addElement("3");
        
        
        // Example of numeric attribute
	Attribute wifeAge = new Attribute("wifeAge"); 
	Attribute wifeEducation = new Attribute("wifeEducation",categorical);
	Attribute husbandEducation = new Attribute("husbandEducation",categorical); 
	Attribute numberChildren = new Attribute("numberChildren"); 
	Attribute wifeReligion = new Attribute("wifeReligion",binary); 
	Attribute wifeWork = new Attribute("wifeWork",binary); 
	Attribute husbandOccupation = new Attribute("husbandOccupation",categorical); 
	Attribute standardLivingIndex = new Attribute("standardLivingIndex",categorical); 
	Attribute mediaExposure = new Attribute("mediaExposure",binary); 
	Attribute contraceptiveMethod = new Attribute("contraceptiveMethod",classification); 
        
	
	// Create a vector of attributes information.
	this.attributes = new FastVector(10);
        
	this.attributes.addElement(wifeAge);
	this.attributes.addElement(wifeEducation);
	this.attributes.addElement(husbandEducation);
	this.attributes.addElement(numberChildren);
	this.attributes.addElement(wifeReligion);
	this.attributes.addElement(wifeWork);
	this.attributes.addElement(husbandOccupation);
	this.attributes.addElement(standardLivingIndex);
	this.attributes.addElement(mediaExposure);
	this.attributes.addElement(contraceptiveMethod);
    }
    
    public void readInstances() {
        // Create an empty set of instances.
	this.instances = new Instances("contraceptive",this.attributes,0);
    }
    
    public static void main(String[] args) {
        CreateArff arff = new CreateArff();
	arff.createAttributes();
	
	// Create 200 instances of more-or-less random data.
	/*for(int i=0;i<40;i++)
	{
	Instance inst = new Instance(3);
	// For class A.
	inst.setValue(x,0.2+0.2*Math.random());
	inst.setValue(y,0.6+0.2*Math.random());
	inst.setValue(classes,"A");
	instances.add(inst);
	// For class B.
	inst.setValue(x,0.6+0.2*Math.random());
	inst.setValue(y,0.6+0.2*Math.random());
	inst.setValue(classes,"B");
	instances.add(inst);
	// For class C.
	inst.setValue(x,0.6+0.2*Math.random());
	inst.setValue(y,0.2+0.2*Math.random());
	inst.setValue(classes,"C");
	instances.add(inst);
	// For classes D and E.
	inst.setValue(x,0.2+0.2*Math.random());
	inst.setValue(y,0.2+0.2*Math.random());
	inst.setValue(classes,"D");
	instances.add(inst);
	inst.setValue(x,0.2+0.2*Math.random());
	inst.setValue(y,0.2+0.2*Math.random());
	inst.setValue(classes,"E");
	instances.add(inst);
	}*/
	// Here is the ARFF file contents. Redirect it or use
	// BufferedWriter.write() to save it to a file.
	//System.out.println(instances);
	}
    
    
}
