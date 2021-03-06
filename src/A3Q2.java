
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 3, 1);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 4);        
        
        Robot commando = new Robot(kw, 1, 1, Direction.EAST);
        
        while(commando.frontIsClear()){
            commando.move();
            commando.turnLeft();
            //This will put commando into a loop, whenever his front is clear
            
        
       if(commando.canPickThing()){
           
          commando.pickThing();
          commando.turnLeft();
          //This will add on to commando's loop, if he comes across any thing
          
          
       }
       
       
       
            
        
        
    }

        
        
    }
}