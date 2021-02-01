package graphiceditor;

public class File implements iFile {

	@Override
	public void openFile() {
		System.out.println("Open file");
	}

	@Override
	public void parseFile() {
		System.out.println("Parse file");
	}

	@Override
	public void saveFile() {
		System.out.println("Save file");
	}

}
