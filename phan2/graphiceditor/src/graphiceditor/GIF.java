package graphiceditor;

public class GIF extends File {

	@Override
	public void openFile() {
		System.out.println("Open file GIF");
	}

	@Override
	public void parseFile() {
		System.out.println("Parse file GIF");
	}

	@Override
	public void saveFile() {
		System.out.println("Save file GIF");
	}

}
