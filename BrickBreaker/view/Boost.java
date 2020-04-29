package BrickBreaker.view;

import BrickBreaker.controller.*;
import java.awt.Color;
import java.awt.Graphics2D;


/**
 *
 * @author meijerid 4/19/20
 */
public class Boost extends StandardGameObject {

    protected final int boostHeight = 10;
    protected final int boostWidth = 10;
    protected final int boostVelocityY = -5;
    protected static double rateDrop = 5;
    protected static int perIncreaseWidth = 500;
    protected int createDropX = 450;
    protected int createDropY = -500;

    /*
    This creates the boost block that comes down and would increase the width of the paddle if caught.
    * @param _x Creates the X level for where the block will place. Will be based on the standard handler when block is destroyed.
    * @param _y Creates the Y level for where the block will place. Will be base don the standard handler when block is destroyed.
    *@param width Creates the block for boost that has a width for the block.
    *@param height Creates the height for the boost block that falls down.
    *@param velX the rate of fall for boost block.
     */

    // for(int i =0; i < 2500; i++){
    public Boost(double _x, double _y, StandardHandler _sh) {
        //for(int i =0; i < 2500; i++){
        super(_x, _y, StandardID.Boost);

        _sh.addEntity(this);
        for (int i = 0; i < 2500; i++) {
            this._x = createDropX;
            this._y = createDropY;
            this.width = boostWidth;
            this.height = boostHeight;
            this.velY = boostVelocityY;
        }
    }

    /**
     * This method keeps the game running with all the components together.
     */
    // for(int i =0; i < 2500; i++){
    @Override
    public void tick() {
        //for(int i =0; i < 2500; i++){
        //This is the vertical motion of the boost.
        this._y += -this.velY;
        // }
    }

    /**
     * This method draws the boost onto the canvas.
     *
     * @param boost
     */
    @Override
    public void render(Graphics2D boost) {
        boost.setColor(Color.red);
        boost.fillRect((int) _x, (int) _y, (int) width, (int) height);
    }

}