
package com.request.dfh0xcp4.dfh0xcmn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This schema was generated for use with CICS.
 * 
 * <p>Java class for ProgramInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramInterface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ca_request_id"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *               &lt;whiteSpace value="preserve"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ca_return_code"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;maxInclusive value="99"/&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ca_response_message"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="79"/&gt;
 *               &lt;whiteSpace value="preserve"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ca_inquire_single"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ca_item_ref_req"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                         &lt;maxInclusive value="9999"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="filler1"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="filler2"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ca_single_item"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ca_sngl_item_ref"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                                   &lt;maxInclusive value="9999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ca_sngl_description"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ca_sngl_department"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                                   &lt;maxInclusive value="999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ca_sngl_cost"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="6"/&gt;
 *                                   &lt;whiteSpace value="preserve"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="in_sngl_stock"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                                   &lt;maxInclusive value="9999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="on_sngl_order"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                                   &lt;maxInclusive value="999"/&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramInterface", propOrder = {
    "caRequestId",
    "caReturnCode",
    "caResponseMessage",
    "caInquireSingle"
})
public class ProgramInterface {

    @XmlElement(name = "ca_request_id", required = true)
    protected String caRequestId;
    @XmlElement(name = "ca_return_code")
    protected int caReturnCode;
    @XmlElement(name = "ca_response_message", required = true)
    protected String caResponseMessage;
    @XmlElement(name = "ca_inquire_single", required = true)
    protected ProgramInterface.CaInquireSingle caInquireSingle;

    /**
     * Gets the value of the caRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaRequestId() {
        return caRequestId;
    }

    /**
     * Sets the value of the caRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaRequestId(String value) {
        this.caRequestId = value;
    }

    /**
     * Gets the value of the caReturnCode property.
     * 
     */
    public int getCaReturnCode() {
        return caReturnCode;
    }

    /**
     * Sets the value of the caReturnCode property.
     * 
     */
    public void setCaReturnCode(int value) {
        this.caReturnCode = value;
    }

    /**
     * Gets the value of the caResponseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaResponseMessage() {
        return caResponseMessage;
    }

    /**
     * Sets the value of the caResponseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaResponseMessage(String value) {
        this.caResponseMessage = value;
    }

    /**
     * Gets the value of the caInquireSingle property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.CaInquireSingle }
     *     
     */
    public ProgramInterface.CaInquireSingle getCaInquireSingle() {
        return caInquireSingle;
    }

    /**
     * Sets the value of the caInquireSingle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.CaInquireSingle }
     *     
     */
    public void setCaInquireSingle(ProgramInterface.CaInquireSingle value) {
        this.caInquireSingle = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ca_item_ref_req"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
     *               &lt;maxInclusive value="9999"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="filler1"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="4"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="filler2"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ca_single_item"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ca_sngl_item_ref"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
     *                         &lt;maxInclusive value="9999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ca_sngl_description"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ca_sngl_department"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
     *                         &lt;maxInclusive value="999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ca_sngl_cost"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="6"/&gt;
     *                         &lt;whiteSpace value="preserve"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="in_sngl_stock"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
     *                         &lt;maxInclusive value="9999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="on_sngl_order"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
     *                         &lt;maxInclusive value="999"/&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "caItemRefReq",
        "filler1",
        "filler2",
        "caSingleItem"
    })
    public static class CaInquireSingle {

        @XmlElement(name = "ca_item_ref_req")
        protected int caItemRefReq;
        @XmlElement(required = true)
        protected String filler1;
        @XmlElement(required = true)
        protected String filler2;
        @XmlElement(name = "ca_single_item", required = true)
        protected ProgramInterface.CaInquireSingle.CaSingleItem caSingleItem;

        /**
         * Gets the value of the caItemRefReq property.
         * 
         */
        public int getCaItemRefReq() {
            return caItemRefReq;
        }

        /**
         * Sets the value of the caItemRefReq property.
         * 
         */
        public void setCaItemRefReq(int value) {
            this.caItemRefReq = value;
        }

        /**
         * Gets the value of the filler1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFiller1() {
            return filler1;
        }

        /**
         * Sets the value of the filler1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFiller1(String value) {
            this.filler1 = value;
        }

        /**
         * Gets the value of the filler2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFiller2() {
            return filler2;
        }

        /**
         * Sets the value of the filler2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFiller2(String value) {
            this.filler2 = value;
        }

        /**
         * Gets the value of the caSingleItem property.
         * 
         * @return
         *     possible object is
         *     {@link ProgramInterface.CaInquireSingle.CaSingleItem }
         *     
         */
        public ProgramInterface.CaInquireSingle.CaSingleItem getCaSingleItem() {
            return caSingleItem;
        }

        /**
         * Sets the value of the caSingleItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramInterface.CaInquireSingle.CaSingleItem }
         *     
         */
        public void setCaSingleItem(ProgramInterface.CaInquireSingle.CaSingleItem value) {
            this.caSingleItem = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ca_sngl_item_ref"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
         *               &lt;maxInclusive value="9999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ca_sngl_description"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="40"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ca_sngl_department"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
         *               &lt;maxInclusive value="999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ca_sngl_cost"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="6"/&gt;
         *               &lt;whiteSpace value="preserve"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="in_sngl_stock"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
         *               &lt;maxInclusive value="9999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="on_sngl_order"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
         *               &lt;maxInclusive value="999"/&gt;
         *               &lt;minInclusive value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "caSnglItemRef",
            "caSnglDescription",
            "caSnglDepartment",
            "caSnglCost",
            "inSnglStock",
            "onSnglOrder"
        })
        public static class CaSingleItem {

            @XmlElement(name = "ca_sngl_item_ref")
            protected int caSnglItemRef;
            @XmlElement(name = "ca_sngl_description", required = true)
            protected String caSnglDescription;
            @XmlElement(name = "ca_sngl_department")
            protected int caSnglDepartment;
            @XmlElement(name = "ca_sngl_cost", required = true)
            protected String caSnglCost;
            @XmlElement(name = "in_sngl_stock")
            protected int inSnglStock;
            @XmlElement(name = "on_sngl_order")
            protected int onSnglOrder;

            /**
             * Gets the value of the caSnglItemRef property.
             * 
             */
            public int getCaSnglItemRef() {
                return caSnglItemRef;
            }

            /**
             * Sets the value of the caSnglItemRef property.
             * 
             */
            public void setCaSnglItemRef(int value) {
                this.caSnglItemRef = value;
            }

            /**
             * Gets the value of the caSnglDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCaSnglDescription() {
                return caSnglDescription;
            }

            /**
             * Sets the value of the caSnglDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCaSnglDescription(String value) {
                this.caSnglDescription = value;
            }

            /**
             * Gets the value of the caSnglDepartment property.
             * 
             */
            public int getCaSnglDepartment() {
                return caSnglDepartment;
            }

            /**
             * Sets the value of the caSnglDepartment property.
             * 
             */
            public void setCaSnglDepartment(int value) {
                this.caSnglDepartment = value;
            }

            /**
             * Gets the value of the caSnglCost property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCaSnglCost() {
                return caSnglCost;
            }

            /**
             * Sets the value of the caSnglCost property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCaSnglCost(String value) {
                this.caSnglCost = value;
            }

            /**
             * Gets the value of the inSnglStock property.
             * 
             */
            public int getInSnglStock() {
                return inSnglStock;
            }

            /**
             * Sets the value of the inSnglStock property.
             * 
             */
            public void setInSnglStock(int value) {
                this.inSnglStock = value;
            }

            /**
             * Gets the value of the onSnglOrder property.
             * 
             */
            public int getOnSnglOrder() {
                return onSnglOrder;
            }

            /**
             * Sets the value of the onSnglOrder property.
             * 
             */
            public void setOnSnglOrder(int value) {
                this.onSnglOrder = value;
            }

        }

    }

}
