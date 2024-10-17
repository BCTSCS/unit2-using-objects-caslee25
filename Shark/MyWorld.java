import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fastfish fastfish = new Fastfish();
        addObject(fastfish,459,272);
        Fastfish fastfish2 = new Fastfish();
        addObject(fastfish2,432,125);
        Fastfish fastfish3 = new Fastfish();    
        addObject(fastfish3,78,200);
        Slowfish slowfish = new Slowfish();
        addObject(slowfish,541,181);
        Slowfish slowfish2 = new Slowfish();
        addObject(slowfish2,168,65);
        Slowfish slowfish3 = new Slowfish();
        addObject(slowfish3,160,278);
    }
}
