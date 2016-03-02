package Helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigPropertiesFile {
	
	protected InputStream input = null;
	protected Properties prop = null;
	
	

	ReadConfigPropertiesFile (){
		try {
		 input  =ReadConfigPropertiesFile.class.getClassLoader().getResourceAsStream("Resources/Config.properties"); 
		 prop =  new Properties();
		 prop.load(input);
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public String getUrl(){
		if(prop.get("url")==null)
			return "";
		return prop.getProperty("url");
	
	}
	public String getBrowser(){
		if(prop.getProperty("browser")== null)
			return "";
		return prop.getProperty("browser");
	}
	
	public String getUserName(){
		if(prop.getProperty("UserName")==null)
			return "";
		return prop.getProperty("userName");
	}
	public String getPassWord(){
		if(prop.getProperty("passWord")==null)
			return "";
		return prop.getProperty("passWord");
	}

}
