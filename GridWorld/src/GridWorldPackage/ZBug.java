/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GridWorldPackage;

/**
 *
 * @author Joseph
 * 
 */
import info.gridworld.actor.*;

public class ZBug extends Bug
{
    private int sideLength;
    private int steps;
    boolean turn;
    boolean loop;
    public ZBug(int _sideLength)
    {
        sideLength = _sideLength;
        steps = 0;
        setDirection(90);
         turn = false;
         loop = false;
    }
    
    public void act()
    {
        if(!loop)
        {
            if(steps < sideLength && canMove())
            {
                move();
                steps++;
            }
            else if(!turn)
            {
                turn(); turn(); turn(); // turns 3 times for the first part
                steps = 0;
                turn = true;
            }
            else if(turn)
            {
                turn();turn();turn();turn();turn();
                steps = 0;
            }
        }
        
    }
}
