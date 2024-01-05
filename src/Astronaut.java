import java.awt.*;

/**
 * Created by chales on 11/6/2017.
 */
public class Astronaut {

    //VARIABLE DECLARATION SECTION
    //Here's where you state which variables you are going to use.
    public String name;                //holds the name of the hero
    public int xpos;                //the x position
    public int ypos;                //the y position
    public int dx;                    //the speed of the hero in the x direction
    public int dy;                    //the speed of the hero in the y direction
    public int width;
    public Rectangle rec; //Rectangle
    public int height;
    public boolean isAlive;            //a boolean to denote if the hero is alive or dead.


    // METHOD DEFINITION SECTION

    // Constructor Definition
    // A constructor builds the object when called and sets variable values.


    //This is a SECOND constructor that takes 3 parameters.  This allows us to specify the hero's name and position when we build it.
    // if you put in a String, an int and an int the program will use this constructor instead of the one above.
    public Astronaut(int pXpos, int pYpos, int pheight, int pwidth, int pdx, int pdy) {
        xpos = pXpos;
        ypos = pYpos;
        dx = pdx;
        dy = pdy;
        width = 60;
        height = 60;
        rec = new Rectangle(xpos, ypos, height, width);
        isAlive = true;

    } // constructor

    //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
    public void move() {
        rec = new Rectangle(xpos, ypos, height, width);
        if (xpos > 900) {
            dx = -dx;
            width = width + 40;

        }

        if (xpos < 0) {
            dx = -dx;

            width = width + 40;


        }
        xpos = xpos + dx;
        ypos = ypos + dy;

        if (ypos > 600) {
            dy = -dy;
            height = height + 20;
        }
        xpos = xpos + dx;
        ypos = ypos + dy;

        if (ypos < 0) {
            dy = -dy;
            height = height + 20;

        }


    }
}






