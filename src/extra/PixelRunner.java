package extra;

public class PixelRunner {
	public static void main(String[] args) {
		PixelParty p = new PixelParty();
		//p.setRainbow(true);
		p.setColor(255, 0, 225);
		p.drawRectangle(10, 20, 8, 25);
		p.setColor(0, 0, 225);
		p.drawCircle(10, 7, 12);
		p.getRandomColor();
		p.drawTriangle(8, 7, 12, 9, 3, 4);
		
		///not working after this line
		p.saveImage();
		p.displayImage();
	}

}
