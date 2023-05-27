import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counter extends Actor
{
    int contar = 0;
    
    /**
     * Act - do whatever the counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
             
        setImage(new GreenfootImage("Score: "+ contar, 24, Color.GREEN, Color.BLACK));
        
    }
    
    public void addcontar()
    {
        // Add your action code here.
             
        contar++;

        
    }
}
