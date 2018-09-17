/**
 * This is a picture of the classic James Bond Gun Barrel Opening
 * If you running the setBlood() method it will even produce the blood
 * seen at the end of the openings.
 * 
 * I also added a color to the setForegroundColor() method. It is used here
 * it was leftover from an earlier idea. However, I decided to leave it in.
 * 
 * @author  Michael (Mike) Moretti
 * @version 09.16.2018
 */
public class Picture
{
    private Circle line1;
    private Circle line2;
    private Circle line3;
    private Circle blood1;
    private Triangle missing;
    private Square background;
    private Circle cover1;
    private Circle cover2;
    private Circle cover3;
    private Circle opening;
    private Person bond;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {      
        bond = new Person();
        blood1 = new Circle();
        cover1 = new Circle();
        cover2 = new Circle();
        cover3 = new Circle();
        line1 = new Circle();
        line2 = new Circle();
        line3 = new Circle();
        opening = new Circle();
        missing = new Triangle();
        background = new Square();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.changeColor("black");
            background.changeSize(100000);
            background.moveHorizontal(-310);
            background.moveVertical(-200);
            background.makeVisible();
            
            line1.changeColor("white");
            line1.changeSize(600);
            line1.moveHorizontal(-230);
            line1.moveVertical(-170);
            line1.makeVisible();
            
            blood1.changeColor("red");
            blood1.changeSize(800);
            blood1.moveVertical(-900);
            blood1.moveHorizontal(-280);
            blood1.makeVisible();
            
            cover1.changeColor("black");
            cover1.changeSize(700);
            cover1.moveHorizontal(-222);
            cover1.moveVertical(-102);
            cover1.makeVisible();
            
            line2.changeColor("white");
            line2.changeSize(550);
            line2.moveHorizontal(-130);
            line2.moveVertical(-98);
            line2.makeVisible();
            
            missing.changeColor("black");
            missing.changeSize(190, 200);
            missing.moveVertical(100);
            missing.moveHorizontal(-40);
            missing.makeVisible();
            
            cover2.changeColor("black");
            cover2.changeSize(500);
            cover2.moveHorizontal(-90);
            cover2.moveVertical(-80);
            cover2.makeVisible();
            
            line3.changeColor("white");
            line3.changeSize(420);
            line3.moveHorizontal(-70);
            line3.moveVertical(-60);
            line3.makeVisible();
            
            cover3.changeColor("black");
            cover3.changeSize(350);
            cover3.moveHorizontal(-40);
            cover3.moveVertical(-40);
            cover3.makeVisible();
            
            opening.changeColor("white");
            opening.changeSize(250);
            opening.makeVisible();
            
            //bond.changeColor("blue");
            bond.changeSize(100, 100);
            bond.moveHorizontal(70);
            bond.moveVertical(-10);
            bond.makeVisible();
            
            
            
           
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    { 
        // only if it's painted already
        if (background != null)
        {
            background.changeColor("black");
            line1.changeColor("white");
            cover1.changeColor("black");
            line2.changeColor("white");
            missing.changeColor("black");
            cover2.changeColor("black");
            line3.changeColor("white");
            cover3.changeColor("black");
            opening.changeColor("white");
            bond.changeColor("black");
            blood1.changeColor("gray");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (background != null)
        {
            background.changeColor("black");
            line1.changeColor("white");
            cover1.changeColor("black");
            line2.changeColor("white");
            missing.changeColor("black");
            cover2.changeColor("black");
            line3.changeColor("white");
            cover3.changeColor("black");
            opening.changeColor("white");
            bond.changeColor("black");
            blood1.changeColor("red");
        }
    }
    
    /**
     * Change the picture to include the classic James Bond Blood
     */
    public void setBlood()
    {  
        blood1.slowMoveVertical(600);
    }
}
