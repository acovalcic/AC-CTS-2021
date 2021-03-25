package ro.ase.acs.cts.connections;

public class RestApiReleaaseV2 extends RestServiceV2{

	public RestApiReleaaseV2(String serverUrl) {
		super(serverUrl);
		System.out.println("Release server v2");
	}

	@Override
	public void connect() {
		System.out.println("Connected succesfully to " + serverUrl);
		
	}

}
