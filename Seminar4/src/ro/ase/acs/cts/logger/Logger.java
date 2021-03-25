package ro.ase.acs.cts.logger;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;

public class Logger {
	private String fileName;
	
	public Logger() {
		fileName = "Log.txt";
	}
	
	public Logger(String fileName) {
		this.fileName = fileName;
	}
	
	public void log(String message) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
			OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			bufferedWriter.write(String.valueOf(new Date())+" ");
			bufferedWriter.write(message);
			bufferedWriter.write(System.lineSeparator());
			
			bufferedWriter.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
