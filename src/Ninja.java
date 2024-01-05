import java.awt.*;

public class Ninja {




        public String Ninja;
        public int xpos;
        public int ypos;
        public int dx;
        public int dy;
        public int width;
    public Rectangle rec;
        public int height;
        public boolean isAlive;


        public Ninja(int pXpos, int pYpos,int pheight, int pwidth, int pdx, int pdy) {
            xpos = pXpos;
            ypos = pYpos;
            dx =pdx;
            dy =pdy;
            width = 60;
            height = 60;
            rec = new Rectangle(xpos, ypos,height, width);
            isAlive = true;

        } // constructor

        //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
        public void move() {
            if (xpos > 1000) {
                xpos= 0;
                width = width+40;

            }

            if (ypos > 800) {
                ypos = 0;
                height = height + 20;
            }
            xpos = xpos + dx;
            ypos = ypos + dy;

            if (ypos < 0) {
                dy = -dx;
                width = width + 0;
            }

        }

    }

