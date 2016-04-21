
package fr.atod26.webservice.fichier.lebaronjerome;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for envoyerImageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="envoyerImageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imageEnvoyee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "envoyerImageResponse", propOrder = {
    "imageEnvoyee"
})
public class EnvoyerImageResponse {

    protected String imageEnvoyee;

    /**
     * Gets the value of the imageEnvoyee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageEnvoyee() {
        return imageEnvoyee;
    }

    /**
     * Sets the value of the imageEnvoyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageEnvoyee(String value) {
        this.imageEnvoyee = value;
    }

}
