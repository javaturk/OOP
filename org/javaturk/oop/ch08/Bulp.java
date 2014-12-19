
package org.javaturk.oop.ch08;

/**
*  A <code>Bulp</code> is a bulp.
 * This class simulates a bulp. It has a default constructor that creates a bulp
 * with a max luminescence of 60 and another constructor that creates a bulp with
 * specified max luminescence.
 * <p>
 * This class has methods to turn on and turn off the bulp and to increase and 
 * to decrease the current luminescence of the bulp.
 *
 * @author Akin Kaldiroglu
 * @version 1.3.7
 * @see <a href="http://www.javaturk.org">JavaTurk.org</a>
 * @since 1.2
 */
public class Bulp{
    
	public static final int STANDARD_MAX_LUMINESCENCE = 60;
    String name;
    private int currentLuminescence;
    protected int maxLuminescence;
    
    /** Creates a new Bulp object with standard luminescence. */
    public Bulp() {
        maxLuminescence = STANDARD_MAX_LUMINESCENCE;
        currentLuminescence = 0;
        System.out.println("A bulb with max luminescence of " + maxLuminescence + " created.");
    }
    
    /** 
     * Creates a new Bulp object with specified max luminescence
     * @param maxLuminescenceValue Max luminescence of the bulp
     */
    public Bulp(int maxLuminescenceValue) {
        maxLuminescence = maxLuminescenceValue;
        currentLuminescence = 0;
        name = "bulb" + new String((new Integer(maxLuminescence)).toString());
        System.out.println("A bulb " + name + " with max luminescence of " + maxLuminescence + " created.");
    }
    
    /** 
     * Sets max luminescence to specified value
     * @param value Specified max luminescence  
     * @exception IllegalArgumentException in case of passing non-positive argument.
     */
    public void setMaxLuminescence(int value) throws IllegalArgumentException{
    	if(value <= 0)
    		throw new IllegalArgumentException("Luminescence value passed must be greater than zero: " + value);
        maxLuminescence = value;
    }
    
    /** 
     * Gets max luminescence of the bulp.
     * @return max luminescence.
     */
    public int getMaxLuminescence(){
        return maxLuminescence;
    }
    
    /** 
     * Turns on the bulp.
     * Curent luminescence is set to max luminescence.
     */
    public void on(){
        currentLuminescence = maxLuminescence;
        System.out.println("Bulb  " + this.name + " is on now");
    }
    
    /** 
     * Turns off the bulp.
     * Curent luminescence is set to 0.
     */
    public void off(){
        currentLuminescence = 0;
        System.out.println("Bulp  " + this.name + " off now");
    }
    
    /** Just brightens the bulp. */
    public void brighten(){
        System.out.println("Bulb  " + this.name + " is brighter now");
    }
    
    /** 
     * Brightens the bulp to specified value.
     * @param value New luminescence of the bulp.
     * @exception IllegalArgumentException in case of passing non-positive argument.
     */
    public void brighten(int value) throws IllegalArgumentException{
    	if(value <= 0)
    		throw new IllegalArgumentException("Luminescence value passed must be greater than zero: " + value);
    	
        if(currentLuminescence < value){
            if(value <= maxLuminescence){
                currentLuminescence = value;
                System.out.println("Luminescence of " + this.name + " is increased to " + currentLuminescence);
            }
            else{
                System.out.println("Max luminescence of " + this.name + " is " + maxLuminescence);
            }
        }
        else{
            System.out.println("Do you want to make " + this.name + " brighter or dimmer?");
            System.out.println("Current luminescence of " + this.name + " is " + currentLuminescence);
            System.out.println("You tried to brighten it to " + value);
        }
    }
    
    /** Just dims the bulp. */
    public void dim(){
        System.out.println("Bulb  " + this.name + " is dimmer now");
    }
    
    /** 
     * Dims the bulp to specified value.
     * @param value New luminescence of the bulp
     */
    public void dim(int value) throws IllegalArgumentException{
    	if(value <= 0)
    		throw new IllegalArgumentException("Luminescence value passed must be greater than zero.");
    	
        if(currentLuminescence > value){
            if(value >= 0){
                currentLuminescence = value;
                System.out.println("Luminescence of " + this.name + " is decreased to " + currentLuminescence);
            }
            else{
                System.out.println("Don't be that silly! I am just a bulb not a black hole");
            }
        }
        else{
            System.out.println("Do you want to make " + this.name + " brighter or dimmer?");
            System.out.println("Current luminescence of " + this.name + " is " + currentLuminescence);
            System.out.println("You tried to dim it to " + value);
        }
    }
    
    /**
     * Main method to create Bulp object and plays with it.
     * @param args[] Standard array of String arguments.
     */
    public static void main(String args[]){
        Bulp bulb = new Bulp();
        bulb.setMaxLuminescence(100);
        int lum = bulb.getMaxLuminescence();
        System.out.println(lum);
        System.out.println(bulb.getMaxLuminescence());
        
        Bulp bulb100 = new Bulp(100);
        Bulp bulb80 = new Bulp(80);
        
        bulb100.brighten(80);
        bulb80.brighten(40);
        bulb100.brighten(40);
        bulb80.brighten();
        bulb100.dim(40);
        bulb80.dim();
        bulb100.dim(60);
        bulb100.brighten(120);
        bulb100.dim(40);
    }
}

