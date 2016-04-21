
package fr.atod26.webservice.fichier.lebaronjerome;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recupererImageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recupererImageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imageRecuperee" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recupererImageResponse", propOrder = {
    "imageRecuperee"
})
public class RecupererImageResponse {

    protected byte[] imageRecuperee;

    /**
     * Gets the value of the imageRecuperee property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageRecuperee() {
        return imageRecuperee;
    }

    /**
     * Sets the value of the imageRecuperee property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageRecuperee(byte[] value) {
        this.imageRecuperee = value;
    }

}
