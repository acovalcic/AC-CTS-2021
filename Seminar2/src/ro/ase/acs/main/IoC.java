package ro.ase.acs.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class IoC {
	private Map<Class<?>, Class<?>> map = new HashMap<>();
	
	public void register(Class<?> contract, Class<?> implementation) {
		if(!map.containsKey(contract)) {
			map.put(contract, implementation);
		}
	}

	public <T> T resolve(Class<?> contract) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		if(map.containsKey(contract)) {
			try {
				Class<?> className = Class.forName(map.get(contract).getName());
				Constructor<?> ctor = className.getConstructor();
				Object object = ctor.newInstance(); 
				return (T)object;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
