package cn.itcast.image;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

public class Demo {

	@Test
	public void fun1() throws FileNotFoundException, IOException {
		BufferedImage bi = new BufferedImage(70, 35, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = (Graphics2D) bi.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 70, 35);
		g.setColor(Color.RED);
		g.drawString("Hello", 2, 2);
		
		ImageIO.write(bi, "JPEG", new FileOutputStream("f:/xxx.jpg"));
		
		
	}

}
