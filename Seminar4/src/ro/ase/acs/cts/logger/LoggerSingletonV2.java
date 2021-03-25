package ro.ase.acs.cts.logger;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;

public class LoggerSingletonV2 {

	public static LoggerSingletonV2 instance = null;
	
	static {
		instance = new LoggerSingletonV2();
	}
	
	public LoggerSingletonV2() {}
	
	public void log(String message) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("Log.txt", true);
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
