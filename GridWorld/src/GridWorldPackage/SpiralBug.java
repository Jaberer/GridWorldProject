/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GridWorldPackage;

import info.gridworld.actor.*;

/**
 *
 * @author Joseph
 * 
 */
public class SpiralBug extends Bug
{
    private int steps;
    private int sideLength;
    
    public SpiralBug(int _sideLength)
    {
        steps = 0;
        sideLength = _sideLength;
    }
    
    public void act()
    {
        if(steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            turn(); //turn();
            steps = 0;
            sideLength++;
        }
    }
}
