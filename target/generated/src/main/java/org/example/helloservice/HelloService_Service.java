package org.example.helloservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0.redhat-611423
 * 2017-03-07T14:10:17.630Z
 * Generated source version: 2.7.0.redhat-611423
 * 
 */
@WebServiceClient(name = "HelloService", 
                  wsdlLocation = "file:/C:/Demo/spring-boot-soap/src/main/resources/META-INF/wsdl/HelloService.wsdl",
                  targetNamespace = "http://www.example.org/HelloService/") 
public class HelloService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/HelloService/", "HelloService");
    public final static QName HelloServiceSOAP = new QName("http://www.example.org/HelloService/", "HelloServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Demo/spring-boot-soap/src/main/resources/META-INF/wsdl/HelloService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Demo/spring-boot-soap/src/main/resources/META-INF/wsdl/HelloService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceSOAP")
    public HelloService getHelloServiceSOAP() {
        return super.getPort(HelloServiceSOAP, HelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceSOAP")
    public HelloService getHelloServiceSOAP(WebServiceFeature... features) {
        return super.getPort(HelloServiceSOAP, HelloService.class, features);
    }

}
