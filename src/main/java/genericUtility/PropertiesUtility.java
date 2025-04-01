package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This is an utility class which deals with Properties file
 * @author VISHAL
 * @version 25.02.28
 */
public class PropertiesUtility {

	/**
	 * This is a generic method to fetch the data from Properties file
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromPropertiesFile(String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(Key);
		return value;	
	}
}
