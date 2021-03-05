package ro.ase.acs.main;

import java.lang.reflect.InvocationTargetException;

import ro.ase.acs.contracts.Writeable;
import ro.ase.acs.readers.Reader;
import ro.ase.acs.writers.FileWriter;

public class Main {

	public static void main(String [] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		IoC ioC = new IoC();
		ioC.register(Readable.class, Reader.class);
		ioC.register(Writeable.class, FileWriter.class);
		Orchestrator orchestrator = 
				new Orchestrator(ioC.resolve(Readable.class), ioC.resolve(Writeable.class));
		orchestrator.execute();
	}
	
}
