package fr.atod26.webservice.fichier.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

import fr.atod26.webservice.fichier.lebaronjerome.GestionImage;
import fr.atod26.webservice.fichier.lebaronjerome.IGestionImage;

public class TestDownloadUpdload {

	private static Logger log = Logger.getLogger(TestDownloadUpdload.class);

	private TestDownloadUpdload() {
		super();
	}

	public static void main(String[] args) {
		log.info("Début des tests");
		IGestionImage proxy;
		GestionImage service = new GestionImage();
		proxy = service.getGestionImageImplPort();
		byte[] imageTrouvee = proxy.recupererImage("Lighthouse.jpg");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File(
					Thread.currentThread().getContextClassLoader()
							.getResource("./").getPath()
							+ "Lighthouse.jpg"));
			fileOutputStream.write(imageTrouvee);
			fileOutputStream.close();
			log.info("Image enregistrée");
		} catch (FileNotFoundException e) {
			log.error("Fichier non trouvé");
			log.error(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
