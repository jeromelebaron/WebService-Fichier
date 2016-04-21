package fr.afcepf.atod26.ws.fichier;

import java.awt.Image;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(targetNamespace = "http://lebaronjerome.fichier.webservice.atod26.fr")
@SOAPBinding(style = Style.DOCUMENT)
public interface IGestionImage {

	@WebMethod(operationName = "recupererImage")
	@WebResult(name = "imageRecuperee")
	Image download(@WebParam(name = "nomImage") String paramNom);

	@WebMethod(operationName = "envoyerImage")
	@WebResult(name = "imageEnvoyee")
	String upload(@WebParam(name = "nomImage") String paramNom,
			@WebParam(name = "image") String paramImage);

}
