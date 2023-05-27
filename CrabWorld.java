import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    counter cont = new counter();
    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(800, 800, 1); 
        prepare();
        
    }
    public counter getcounter()
    {    
        return cont;
        
        
    }
    public void prepare()
    {    
        addObject(cont, 200, 100);
        
    }
    
}
