package procesos_pi_scripts;


	import java.io.*;
import java.util.Properties;
public class propiedades {
	
	
	String archivo_properties="D:\\scripts\\00_GUI\\procesos_pi_scripts.properties";
	//String archivo_properties="procesos_pi_scripts.properties";
	
	
	String ruta_landis_to_pi_bat;
	String ruta_landis_to_pi_bat_manual;
	String ruta_pi_to_cms_bat;
	String ruta_pi_to_cms_bat_manual;
	String ayuda;
	String host;
	String from;
	String to;
	String cc;
	
	Properties prop  = new Properties();
	
	String ruta_landis_to_pi_bat(){
			try{
				prop.load(new FileInputStream(archivo_properties));
				ruta_landis_to_pi_bat = prop.getProperty("ruta_landis_to_pi_bat");
			}catch(IOException e){
			}
			return ruta_landis_to_pi_bat;
			}
	String ruta_landis_to_pi_bat_manual(){
		try{
			prop.load(new FileInputStream(archivo_properties));
			ruta_landis_to_pi_bat_manual = prop.getProperty("ruta_landis_to_pi_bat_manual");
		}catch(IOException e){
		}
		return ruta_landis_to_pi_bat_manual;
		}
	
	String ruta_pi_to_cms_bat(){
		try{
			prop.load(new FileInputStream(archivo_properties));
			ruta_pi_to_cms_bat = prop.getProperty("ruta_pi_to_cms_bat");
		}catch(IOException e){
		}
		return ruta_pi_to_cms_bat;
		}
	String ruta_pi_to_cms_bat_manual(){
		try{
			prop.load(new FileInputStream(archivo_properties));
			ruta_pi_to_cms_bat_manual = prop.getProperty("ruta_pi_to_cms_bat_manual");
		}catch(IOException e){
		}
		return ruta_pi_to_cms_bat_manual;
		}
		
	String ayuda(){
		try{
			prop.load(new FileInputStream(archivo_properties));
			ayuda = prop.getProperty("ayuda");
		}catch(IOException e){
		}
		return ayuda;
		}
	String host(){
		try{
			prop.load(new FileInputStream(archivo_properties));
			host = prop.getProperty("host");
		}catch(IOException e){
		}
		return host;
		}
	String from(){
		try{
			prop.load(new FileInputStream(archivo_properties));
			from = prop.getProperty("from");
		}catch(IOException e){
		}
		return from;
		}
	String to(){
		try{
			prop.load(new FileInputStream(archivo_properties));
			to = prop.getProperty("to");
		}catch(IOException e){
		}
		return to;
		}
	String cc(){
		try{
			prop.load(new FileInputStream(archivo_properties));
			cc = prop.getProperty("cc");
		}catch(IOException e){
		}
		return cc;
		}
	
	
}