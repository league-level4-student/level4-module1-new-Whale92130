package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
public class MovingMorph extends Polymorph {
	boolean swi = false;
	boolean swii = false;
	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {
		Random r = new Random();
		//x
		if (swi == false) {
		if (getX() <= 450) {
			setX(getX() + r.nextInt(5)+1);
		}
		else {
			swi = true;
			
		}
		}
		if (swi == true)
		if (getX() >= 10){
			setX(getX() - (r.nextInt(5)+1));
		}
		else {
			swi = false;
		}
		//y
		if (swii == false) {
			if (getY() <= 450) {
				setY(getY() + r.nextInt(5)+1);
				System.out.println("moving down");
			}
			else {
				swii = true;
				
			}
			}
			if (swii == true) {
			if (getY() >= 10){
				System.out.println("moving up");
				setY(getY() - (r.nextInt(5)+1));
			}
			else {
				swii = false;
			}
			}

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());

	}

}
