package fr.afcepf.atod26.ws.fichier.impl;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.ws.fichier.IGestionImage;

@WebService(targetNamespace = "http://lebaronjerome.fichier.webservice.atod26.fr", endpointInterface = "fr.afcepf.atod26.ws.fichier.IGestionImage", serviceName = "gestionImage")
@MTOM
public class GestionImageImpl implements IGestionImage {

	private Logger log = Logger.getLogger(GestionImageImpl.class);

	@Override
	public Image download(String paramNom) {
		String pathImage = getClass().getResource("./").getPath();
		log.info(pathImage);
		pathImage = pathImage.split("/WEB-INF")[0];
		log.info(pathImage);
		final File fichierImage = new File(pathImage + "/resources/" + paramNom);
		Image image = null;
		if (fichierImage.exists()) {
			try {
				image = ImageIO.read(fichierImage);
			} catch (IOException e) {
				log.error("Erreur avec l'image");
				log.error(e);
			}
		}
		return image;
	}

	@Override
	public String upload(String paramNom, String paramImage) {
		return null;
	}

}
