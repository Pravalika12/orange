package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileUtil {
	public String readDataFromPropfile(String key) throws IOException  
	{
		FileInputStream fis= new FileInputStream(IAutoConstants.propfilepath);
		Properties prop=new Properties();
		prop.load(fis);

		return prop.getProperty(key);
}
}
