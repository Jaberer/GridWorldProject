package GridWorldPackage;

// CHINMAY Nikrhe is y0l0 $w4ggie$ m@$7aarr w0w 4maz3
// Joseph Zhong is even more amazing, sorry.

/**
* Clone of the classic Snake game (a.k.a. Nibbles).
* The GUI is the standard for GridWorld and the snake
* is controlled by the arrow keys on the keyboard.
* (the code is provided for KeyEvent handling in the main)
* 
* @author  Dave Rut, Niles North High School
*/

import info.gridworld.actor.*; 
import info.gridworld.grid.*; 

public class SnakeGame 
{ 
	public static ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(19, 19)); 
	public static SnakeBug head = new SnakeBug(); 
   
	public static void main(String[] args) 
        { 
		head.setDirection(0); 
		world.add(new Location(17, 9), head); 
		// Uncomment once randomFlower() is implemented
		head.randomFlower();
		
		// Read this code below but don't worry too much about it
		// It makes the snake head face a direction based
		// on keyboard input.
		java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager()
			.addKeyEventDispatcher(new java.awt.KeyEventDispatcher() 
                        { 
                            @Override
			public boolean dispatchKeyEvent(java.awt.event.KeyEvent event) 
                        { 
				String key = javax.swing.KeyStroke.getKeyStrokeForEvent(event).toString(); 
				if (key.equals("pressed UP") && head.getDirection() != 180)
                                {
                                    head.setDirection(0);
                                } 
				if (key.equals("pressed RIGHT") && head.getDirection() != 270) 
                                {
                                    head.setDirection(90);
                                } 
				if (key.equals("pressed DOWN") && head.getDirection() != 0)     
                                {
                                    head.setDirection(180);
                                } 
				if (key.equals("pressed LEFT") && head.getDirection() != 90) 
                                {
                                    head.setDirection(270);
                                } 
				return true; 
			}
		});
		
		world.show(); 
	}
}