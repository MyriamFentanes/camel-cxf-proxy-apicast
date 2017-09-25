CXF WebService 3Scale plugin  example
============================

An example which proxies a real web service by a Camel application using the camel-cxf component

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

Because we use dynamic port numbers, you have to check the console to get the used one.
To stop the example hit ctrl + c

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


When you run the example in standalone mode as the camel contaxt start you will see in the console the actual port where the SOAP web service endpoint was started:



The dependency for 3Scale plugin:

<dependency>
    <groupId>net.3scale</groupId>
    <artifactId>3scale-api</artifactId>
    <version>3.0.4</version>
</dependency>

The code to authenticate and authorize against API Manger is on the org.apache.camel.example.cxf.proxy.APICastBean class
The original example is on https://github.com/3scale/3scale_ws_api_for_java.git

If the authentication is donde succesful you should see the output 

Body is instance of java.io.InputStream]]
AuthRep on App Id Success: true
Plan: Basic
2017-08-25 07:28:47,442 [tp1591616468-31] INFO  input                          - Exchange[ExchangePattern: InOut, BodyType: null, Body: [Body is instance of java.io.InputStream]]
Incident was 3, changed to 456



Invoked real web service: id=456 by Myriam Fentanes


