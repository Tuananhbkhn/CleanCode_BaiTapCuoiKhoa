package graphiceditor;

public class PNG extends File {

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
