package ro.ase.acs.cts.main;

import ro.ase.acs.cts.connections.Configuration;
import ro.ase.acs.cts.connections.RestService;
import ro.ase.acs.cts.connections.RestServiceV2;
import ro.ase.acs.cts.connections.ServerType;
import ro.ase.acs.cts.connections.SimpleFactory;
import ro.ase.acs.cts.connections.SimpleFactoryV2;
//import ro.ase.acs.cts.logger.Logger;
import ro.ase.acs.cts.logger.LoggerSingleton;

public class Program {

	public static void main(String[] args) {
//		Logger logger = new Logger();
//		logger.log("Main ended!");
		LoggerSingleton loggerSingleton = LoggerSingleton.getInstance();
		loggerSingleton.log("Main s a deschis!");
		loggerSingleton = LoggerSingleton.getInstance("Logger.txt");
		loggerSingleton.log("Main s a terminat!");
		
//		RestApiRelease restApi = new RestApiRelease();
//		restApi.connect();
		
		RestService restService = SimpleFactory.createConnection(ServerType.DEVELOPMENT);
		restService.connect();
		
		RestServiceV2 restV2= SimpleFactoryV2.createConnection(
				Configuration.readConfiguration(), "https:./.");
		restV2.connect();
	}

}
