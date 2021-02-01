package graphiceditor;

public class JPG extends File {

	@Override
	public void openFile() {
		System.out.println("Open file JPG");
	}

	@Override
	public void parseFile() {
		System.out.println("Parse file JPG");
	}

	@Override
	public void saveFile() {
		System.out.println("Save file JPG");
	}

}
