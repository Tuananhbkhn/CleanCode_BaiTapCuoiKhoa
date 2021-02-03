package graphiceditor;

public class PNG implements iFile {

	@Override
	public void openFile() {
		System.out.println("Open file PNG");
	}

	@Override
	public void parseFile() {
		System.out.println("Parse file PNG");
	}

	@Override
	public void saveFile() {
		System.out.println("Save file PNG");
	}

}
