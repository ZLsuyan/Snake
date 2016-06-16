import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class Egg {
	int row,col;
	int w = Yard.BLOCK_SIZE;
	int h = Yard.BLOCK_SIZE;
	private static Random r = new Random();
	private Color color = Color.GREEN;
	
	public Egg(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public Egg() {
		this(r.nextInt(Yard.ROWS-2)+2,r.nextInt(Yard.COLS));
	}
	
	public void reAppear() {
		this.row = r.nextInt(Yard.ROWS-2)+2;
		this.col = r.nextInt(Yard.COLS);
	}
	
	public Rectangle getRect() {
		return new Rectangle(Yard.BLOCK_SIZE*this.col, Yard.BLOCK_SIZE*this.row, w, h);
		}
	
	public void draw(Graphics g){
		Color c = g.getColor();
		g.setColor(color);
		/*
		 * fillRect（x,y,w,h）函数的作用是：
		 * 填充一个矩形区域，x、y为起始坐标（即左上角坐标）,
		 * 后面两个参数分别为：w、h,是矩形区域的宽和高.
		 */
		g.fillOval(Yard.BLOCK_SIZE*col, Yard.BLOCK_SIZE*row, w, h);
		g.setColor(c);
//		if(color == Color.GREEN) color = Color.RED;
//		else color = Color.GREEN;
	}
	
}
