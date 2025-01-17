import java.awt.Color;
import java.util.Random;

/** Aquarium Lab Series: <br>    
 *      The AquaSimApplication class contains the main function that will
 *      run the Aquarium Simulation. (This description should be updated
 *      when the behavior of the program changes.)<br>
 *
 * Modifications: <br>
 *   23 March 2008,  Alyce Brady,  Created skeleton main that constructs and
 *                                 displays an empty aquarium.<br>
 *   (date), (your name), Modified to .... <br>
 *
 *  @author  Alyce Brady  (should be Your Name)
 *  @version 23 March 2008  (should be today's date)
 *  @see AquariumController
 **/
public class AquaSimApplication
{
    /**
     *  This is the main function.  It executes the program.
     *  @param    String args[] is never used
     **/
        private static Random generator;
    public static void main(String args[])
    {
        System.out.println("Sup. Start kid.");

        // CONSTRUCT OBJECTS NEEDED FOR THE AQUARIUM SIMULATION.
        generator = new Random();
        
        // Construct the aquarium.  Specify its dimensions when creating it.
        Aquarium aqua;                 // create reference to an Aquarium ...
        aqua = new Aquarium(2400, 1920); // ... object that has now been created

        // Construct fish and add them to the aquarium.
        //      Adding fish to aquarium
        AquaFish dog = new AquaFish(aqua, getColor());
        aqua.add(dog);
        
        AquaFish cat = new AquaFish(aqua, getColor());
        aqua.add(cat);
        
        AquaFish kid = new AquaFish(aqua, getColor());
        aqua.add(kid);
        
        AquaFish dude = new AquaFish(aqua, getColor());
        aqua.add(dude);
 
        AquaFish dued = new AquaFish(aqua, getColor());
        aqua.add(dued);
        
        AquaFish bro = new AquaFish(aqua, getColor());
        aqua.add(bro);
        // Construct a graphical user interface (GUI) to display and control
        // the simulation.  The user interface needs to know about the
        // aquarium, so we pass aqua to the user interface constructor.
        AquaSimGUI userInterface;              // create reference to GUI ...
        userInterface = new AquaSimGUI(aqua, true);  // ... and then GUI itself
        
        // Tell the user how to start the aquarium simulation.
        System.out.println("Click start. Hurry up.");

        // Now wait for the user to press the start button.
        userInterface.waitForStart();

        // Draw the initial view of the aquarium and its contents.
        userInterface.showAquarium();

        // RUN THE AQUARIUM SIMULATION.

        // Make the fish move and redisplay.
        //      CODE MISSING HERE!

        dog.moveForward();
        cat.moveForward();
        kid.moveForward();
        dude.moveForward();
        dued.moveForward();
        bro.moveForward();
        
        userInterface.showAquarium();
        
        for (int i=0 ; i<userInterface.getNumberOfSteps() ; i++)
        {
            if (dog.atWall())
                dog.changeDir();
            dog.moveForward();
        
            if (cat.atWall())
                cat.changeDir();
            cat.moveForward();
        
            if (kid.atWall())
                kid.changeDir();
            kid.moveForward();
            
            if (dude.atWall())
                dude.changeDir();
            dude.moveForward();
            
            if (dued.atWall())
                dued.changeDir();
            dued.moveForward();
            
            if (bro.atWall())
                bro.changeDir();
            bro.moveForward();
            
            userInterface.showAquarium();
        }
        // WRAP UP.
        
        // Remind user how to quit application.

    }//end main
    public static Color getColor()
    {
        int randNum = generator.nextInt(6);
        if (randNum == 0){
            return Color.RED;
        }else if (randNum == 1){
            return Color.BLUE;
        }else if (randNum == 2){
            return Color.ORANGE;
        }else if (randNum == 3){
            return Color.YELLOW;
        }else if (randNum == 4){
            return Color.MAGENTA;
        }else{
            return Color.GREEN;
        }
    }
    public static void getDir()
    {
        int newNum = generator.nextInt(4);
        if (newNum == 0){
            return changeDir();
        }
        
    }
}//end class
