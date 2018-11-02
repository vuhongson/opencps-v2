//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.02 at 04:08:16 PM ICT 
//


package org.opencps.thirdparty.system.nsw.vt.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.opencps.thirdparty.system.nsw.vt.model package. 
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

    private final static QName _KetQuaXuLy_QNAME = new QName("", "KetQuaXuLy");
    private final static QName _NSWRequest_QNAME = new QName("", "NSWRequest");
    private final static QName _Reference_QNAME = new QName("", "Reference");
    private final static QName _ThongtinLoi_QNAME = new QName("", "Thongtin_Loi");
    private final static QName _AttachedFile_QNAME = new QName("", "AttachedFile");
    private final static QName _From_QNAME = new QName("", "From");
    private final static QName _IssuingAuthority_QNAME = new QName("", "IssuingAuthority");
    private final static QName _Subject_QNAME = new QName("", "Subject");
    private final static QName _DSLoi_QNAME = new QName("", "DS_Loi");
    private final static QName _ResultOfExtending_QNAME = new QName("", "ResultOfExtending");
    private final static QName _Header_QNAME = new QName("", "Header");
    private final static QName _Content_QNAME = new QName("", "Content");
    private final static QName _PhanhoiYeucauSua_QNAME = new QName("", "Phanhoi_Yeucau_Sua");
    private final static QName _To_QNAME = new QName("", "To");
    private final static QName _Body_QNAME = new QName("", "Body");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.opencps.thirdparty.system.nsw.vt.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KetQuaXuLy }
     * 
     */
    public KetQuaXuLy createKetQuaXuLy() {
        return new KetQuaXuLy();
    }

    /**
     * Create an instance of {@link NSWRequest }
     * 
     */
    public NSWRequest createNSWRequest() {
        return new NSWRequest();
    }

    /**
     * Create an instance of {@link RequestPayload }
     * 
     */
    public RequestPayload createRequestPayload() {
        return new RequestPayload();
    }

    /**
     * Create an instance of {@link Envelope }
     * 
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link ResponsePayload }
     * 
     */
    public ResponsePayload createResponsePayload() {
        return new ResponsePayload();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link ThongtinLoi }
     * 
     */
    public ThongtinLoi createThongtinLoi() {
        return new ThongtinLoi();
    }

    /**
     * Create an instance of {@link AttachedFile }
     * 
     */
    public AttachedFile createAttachedFile() {
        return new AttachedFile();
    }

    /**
     * Create an instance of {@link From }
     * 
     */
    public From createFrom() {
        return new From();
    }

    /**
     * Create an instance of {@link IssuingAuthority }
     * 
     */
    public IssuingAuthority createIssuingAuthority() {
        return new IssuingAuthority();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link DSLoi }
     * 
     */
    public DSLoi createDSLoi() {
        return new DSLoi();
    }

    /**
     * Create an instance of {@link ResultOfExtending }
     * 
     */
    public ResultOfExtending createResultOfExtending() {
        return new ResultOfExtending();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link PhanhoiYeucauSua }
     * 
     */
    public PhanhoiYeucauSua createPhanhoiYeucauSua() {
        return new PhanhoiYeucauSua();
    }

    /**
     * Create an instance of {@link To }
     * 
     */
    public To createTo() {
        return new To();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KetQuaXuLy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "KetQuaXuLy")
    public JAXBElement<KetQuaXuLy> createKetQuaXuLy(KetQuaXuLy value) {
        return new JAXBElement<KetQuaXuLy>(_KetQuaXuLy_QNAME, KetQuaXuLy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NSWRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NSWRequest")
    public JAXBElement<NSWRequest> createNSWRequest(NSWRequest value) {
        return new JAXBElement<NSWRequest>(_NSWRequest_QNAME, NSWRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Reference")
    public JAXBElement<Reference> createReference(Reference value) {
        return new JAXBElement<Reference>(_Reference_QNAME, Reference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThongtinLoi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Thongtin_Loi")
    public JAXBElement<ThongtinLoi> createThongtinLoi(ThongtinLoi value) {
        return new JAXBElement<ThongtinLoi>(_ThongtinLoi_QNAME, ThongtinLoi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachedFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AttachedFile")
    public JAXBElement<AttachedFile> createAttachedFile(AttachedFile value) {
        return new JAXBElement<AttachedFile>(_AttachedFile_QNAME, AttachedFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link From }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "From")
    public JAXBElement<From> createFrom(From value) {
        return new JAXBElement<From>(_From_QNAME, From.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuingAuthority }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssuingAuthority")
    public JAXBElement<IssuingAuthority> createIssuingAuthority(IssuingAuthority value) {
        return new JAXBElement<IssuingAuthority>(_IssuingAuthority_QNAME, IssuingAuthority.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Subject")
    public JAXBElement<Subject> createSubject(Subject value) {
        return new JAXBElement<Subject>(_Subject_QNAME, Subject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSLoi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DS_Loi")
    public JAXBElement<DSLoi> createDSLoi(DSLoi value) {
        return new JAXBElement<DSLoi>(_DSLoi_QNAME, DSLoi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultOfExtending }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ResultOfExtending")
    public JAXBElement<ResultOfExtending> createResultOfExtending(ResultOfExtending value) {
        return new JAXBElement<ResultOfExtending>(_ResultOfExtending_QNAME, ResultOfExtending.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Content }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Content")
    public JAXBElement<Content> createContent(Content value) {
        return new JAXBElement<Content>(_Content_QNAME, Content.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhanhoiYeucauSua }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Phanhoi_Yeucau_Sua")
    public JAXBElement<PhanhoiYeucauSua> createPhanhoiYeucauSua(PhanhoiYeucauSua value) {
        return new JAXBElement<PhanhoiYeucauSua>(_PhanhoiYeucauSua_QNAME, PhanhoiYeucauSua.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link To }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "To")
    public JAXBElement<To> createTo(To value) {
        return new JAXBElement<To>(_To_QNAME, To.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Body }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Body")
    public JAXBElement<Body> createBody(Body value) {
        return new JAXBElement<Body>(_Body_QNAME, Body.class, null, value);
    }

}
