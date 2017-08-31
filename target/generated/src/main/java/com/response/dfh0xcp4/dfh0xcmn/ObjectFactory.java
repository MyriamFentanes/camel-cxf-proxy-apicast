
package com.response.dfh0xcp4.dfh0xcmn;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.response.dfh0xcp4.dfh0xcmn package. 
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

    private final static QName _DFH0XCMNOperationResponse_QNAME = new QName("http://www.DFH0XCMN.DFH0XCP4.Response.com", "DFH0XCMNOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.response.dfh0xcp4.dfh0xcmn
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProgramInterface }
     * 
     */
    public ProgramInterface createProgramInterface() {
        return new ProgramInterface();
    }

    /**
     * Create an instance of {@link ProgramInterface.CaInquireSingle }
     * 
     */
    public ProgramInterface.CaInquireSingle createProgramInterfaceCaInquireSingle() {
        return new ProgramInterface.CaInquireSingle();
    }

    /**
     * Create an instance of {@link ProgramInterface.CaInquireSingle.CaSingleItem }
     * 
     */
    public ProgramInterface.CaInquireSingle.CaSingleItem createProgramInterfaceCaInquireSingleCaSingleItem() {
        return new ProgramInterface.CaInquireSingle.CaSingleItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.DFH0XCMN.DFH0XCP4.Response.com", name = "DFH0XCMNOperationResponse")
    public JAXBElement<ProgramInterface> createDFH0XCMNOperationResponse(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_DFH0XCMNOperationResponse_QNAME, ProgramInterface.class, null, value);
    }

}
