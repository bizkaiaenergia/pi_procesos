package procesos_pi_scripts;




import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.*;





public class arrancar_procesos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{    
		      
			final String ruta_landis_to_pi_bat;
			final String ruta_pi_to_cms_bat;
			
			
			propiedades Archivopropiedades1 = new propiedades();
			ruta_landis_to_pi_bat = Archivopropiedades1.ruta_landis_to_pi_bat();
			
			
			ruta_pi_to_cms_bat = Archivopropiedades1.ruta_pi_to_cms_bat();
			
			
			Desktop desktop = null;
			desktop = Desktop.getDesktop();
			try {
				desktop.open(new File(ruta_landis_to_pi_bat));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				desktop.open(new File(ruta_pi_to_cms_bat));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		      //return email;
		   }
	}
}
		
		