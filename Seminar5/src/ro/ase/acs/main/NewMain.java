package ro.ase.acs.main;

import ro.ase.acs.factorymethod.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.FileType;
import ro.ase.acs.factorymethod.OpenOfficeFactory;
import ro.ase.acs.simplefactory.Document;
import ro.ase.acs.simplefactory.NoSuchDocumentException;

public class NewMain {

	public static void main(String[] args) {

		AbstractDocumentFactory documentFactory = new OpenOfficeFactory();
		try {
			Document document = documentFactory.getDocument(FileType.SPREADSHEET, "Studenti");
			document.open();
		} catch (NoSuchDocumentException e) {
			e.printStackTrace();
		}

	}

}
