
package fr.atod26.webservice.fichier.lebaronjerome;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.atod26.webservice.fichier.lebaronjerome package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RecupererImageResponse_QNAME = new QName("http://lebaronjerome.fichier.webservice.atod26.fr", "recupererImageResponse");
    private final static QName _EnvoyerImageResponse_QNAME = new QName("http://lebaronjerome.fichier.webservice.atod26.fr", "envoyerImageResponse");
    private final static QName _EnvoyerImage_QNAME = new QName("http://lebaronjerome.fichier.webservice.atod26.fr", "envoyerImage");
    private final static QName _RecupererImage_QNAME = new QName("http://lebaronjerome.fichier.webservice.atod26.fr", "recupererImage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.atod26.webservice.fichier.lebaronjerome
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnvoyerImage }
     * 
     */
    public EnvoyerImage createEnvoyerImage() {
        return new EnvoyerImage();
    }

    /**
     * Create an instance of {@link EnvoyerImageResponse }
     * 
     */
    public EnvoyerImageResponse createEnvoyerImageResponse() {
        return new EnvoyerImageResponse();
    }

    /**
     * Create an instance of {@link RecupererImageResponse }
     * 
     */
    public RecupererImageResponse createRecupererImageResponse() {
        return new RecupererImageResponse();
    }

    /**
     * Create an instance of {@link RecupererImage }
     * 
     */
    public RecupererImage createRecupererImage() {
        return new RecupererImage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.fichier.webservice.atod26.fr", name = "recupererImageResponse")
    public JAXBElement<RecupererImageResponse> createRecupererImageResponse(RecupererImageResponse value) {
        return new JAXBElement<RecupererImageResponse>(_RecupererImageResponse_QNAME, RecupererImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvoyerImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.fichier.webservice.atod26.fr", name = "envoyerImageResponse")
    public JAXBElement<EnvoyerImageResponse> createEnvoyerImageResponse(EnvoyerImageResponse value) {
        return new JAXBElement<EnvoyerImageResponse>(_EnvoyerImageResponse_QNAME, EnvoyerImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvoyerImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.fichier.webservice.atod26.fr", name = "envoyerImage")
    public JAXBElement<EnvoyerImage> createEnvoyerImage(EnvoyerImage value) {
        return new JAXBElement<EnvoyerImage>(_EnvoyerImage_QNAME, EnvoyerImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupererImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lebaronjerome.fichier.webservice.atod26.fr", name = "recupererImage")
    public JAXBElement<RecupererImage> createRecupererImage(RecupererImage value) {
        return new JAXBElement<RecupererImage>(_RecupererImage_QNAME, RecupererImage.class, null, value);
    }

}
