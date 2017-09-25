CXF WebService 3Scale plugin example
============================
An example that integrates the 3Scale java plugin with a Camel CXF SOAP proxy route. The code to authenticate and authorize against API Manger is on the org.apache.camel.example.cxf.proxy.APICastBean class

The original example is here: https://github.com/3scale/3scale_ws_api_for_java.git

The documentation of the multiple deployment options for 3Scale can be found here: 
https://support.3scale.net/docs/deployment-options/plugin-setup

The credentials to authorize the API invocation:
* AppID
* AppKey
* serviceToken
* serviceId
are defined in src/main/resources/META-INF/spring/camel-config.xml 

Dependecies

The dependency for 3Scale plugin:

<dependency>
    <groupId>net.3scale</groupId>
    <artifactId>3scale-api</artifactId>
    <version>3.0.4</version>
</dependency>

When installed on Fuse you will need to also install the jar :
nom-1.2.10.jarÿ

Run

To run it in standalone mode:

You will need to compile this example first:
  mvn compile

To run the example in standalone mode type:
  mvn camel:run

The proxied webservice is located at
  http://localhost:<port 1>/camel-example-cxf-proxy/webservices/incident

The real webservice is located at
  http://localhost:<port 2>/real-webservice

The webservice WSDL is exposed at:
  http://localhost:<port 1>/camel-example-cxf-proxy/webservices/incident?wsdl

Because we use dynamic port numbers, you have to check the console to get the used one. You will see a message like the following:

{http://reportincident.example.camel.apache.org}ReportIncidentEndpointService from WSDL: etc/report_incident.wsdl
2017-09-22 13:59:50,718 [ing.Main.main()] INFO ÿServerImpl ÿ ÿ ÿ ÿ ÿ ÿ ÿ ÿ ÿ ÿ - Setting the server's publish address to beÿhttp://localhost:1101/camel-example-cxf-proxy/webservices/incident
2017-09-22 13:59:50,718 [ing.Main.main()] INFO ÿRAWDataFormatFeature ÿ ÿ ÿ ÿ ÿ - removing the interceptor org.apache.cxf.interceptor.OneWayProcessorInterceptor@46e6cb9

To stop the example hit ctrl + c

To run it on top of JBoss Fuse

Install the bundle and the dependencies either using Fabric profiles:

mvn:org.apache.camel/cxf-proxy-embedded-apicast/2.15.1.redhat-620133

Or on a standalone Fuse instance
Osgi:install org.apache.camel/cxf-proxy-embedded-apicast/2.15.1.redhat-620133
The ports used when the route is installed on Fuse are defined in the incidents.properties file in the resources folder 

Test
To make a SOAP call open soapUI or another SOAP query tool and create a new
project w/WSDL of http://localhost:<port 1>/camel-example-cxf-proxy/webservices/incident?wsdl.
Then make SOAP requests of this format:

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" 
                  xmlns:rep="http://reportincident.example.camel.apache.org">
   <soapenv:Header/>
   <soapenv:Body>
      <rep:inputReportIncident>
         <incidentId></incidentId>
         <incidentDate>2011-11-18</incidentDate>
         <givenName>Bob</givenName>
         <familyName>Smith</familyName>
         <summary>Bla bla</summary>
         <details>More bla</details>
         <email>davsclaus@apache.org</email>
         <phone>12345678</phone>
      </rep:inputReportIncident>
   </soapenv:Body>
</soapenv:Envelope>



If the authentication is donde succesful you should see the output 

Body is instance of java.io.InputStream]]
AuthRep on App Id Success: true
Plan: Basic
2017-08-25 07:28:47,442 [tp1591616468-31] INFO  input                          - Exchange[ExchangePattern: InOut, BodyType: null, Body: [Body is instance of java.io.InputStream]]
Incident was 3, changed to 456



Invoked real web service: id=456 by Myriam Fentanes


