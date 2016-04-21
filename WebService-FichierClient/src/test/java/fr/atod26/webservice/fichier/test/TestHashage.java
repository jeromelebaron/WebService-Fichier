package fr.atod26.webservice.fichier.test;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;

public class TestHashage {

	private static Logger log = Logger.getLogger(TestHashage.class);
	
	public static void main(String[] args) {
		
		String chaineHachee = DigestUtils.sha256Hex("afcepf");
		log.info(chaineHachee);
		SecureRandom random = new SecureRandom();
		String chaineAleatoire = new BigInteger(130, random).toString(32);
		log.info(chaineAleatoire);
		log.info(DigestUtils.sha256Hex(chaineAleatoire));
	}
	
	
}
