package graphiceditor;

public class GraphicsEditor {
	public static void main(String[] args) {
	 File bmp = new BMP();
	 File gif = new GIF();
	 File png = new PNG();
	 File jpg = new JPG();
	 
	 bmp.openFile();
	 gif.openFile();
	 png.openFile();
	 jpg.openFile();
	 
	 bmp.parseFile();
	 gif.parseFile();
	 png.parseFile();
	 jpg.parseFile();
	 
	 bmp.saveFile();
	 gif.saveFile();
	 png.saveFile();
	 jpg.saveFile();
	 
	}
}
