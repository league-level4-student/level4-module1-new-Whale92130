package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    int getX() {
    	return x;
    }
    int getY() {
    	return y;
    }
    int getWidth() {
    	return width;
    }
    int getHeight() {
    	return height;
    }
    void setX(int x) {
    	this.x = x;
    }
    void setY(int y) {
    	this.y = y;
    }
    void setWidth(int w) {
    	this.width = w;
    }
    void setHeight(int h) {
    	this.height = h;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
