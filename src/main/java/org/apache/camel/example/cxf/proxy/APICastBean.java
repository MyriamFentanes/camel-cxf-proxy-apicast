package org.apache.camel.example.cxf.proxy;

import threescale.v3.api.AuthorizeResponse;
import threescale.v3.api.ParameterMap;
import threescale.v3.api.ServerError;
import threescale.v3.api.ServiceApi;
import threescale.v3.api.impl.ServiceApiDriver;

public class APICastBean {

	ServiceApi serviceApi = ServiceApiDriver.createApi();
	public void process()
	{
		// When connecting to an on-premise instance of the 3scale platform,
		// create
		// the API object for a given host and port:
		// ServiceApi serviceApi =
		// ServiceApiDriver.createApi("backend.example.com",
		// 80, true);

		//TODO Change with the 3Scale account information of your account.
		ParameterMap params = new ParameterMap(); // the parameters of your call
		params.add("app_id", "75c223c8"); // Add app_id of your application
												// for authorization
		params.add("app_key", "df292e8ba1cb94012579d6fc34857348"); // Add app_key of your
												// application for authorization
		String serviceToken = "da523f1bcd613d64f7750fdabca3676852085a3ebf557be6345c4178824cb7d5"; // Your 3scale service token
		String serviceId = "2555417746568"; // The service id of your application

		ParameterMap usage = new ParameterMap(); // Add a metric to the call
		usage.add("hits", "1");
		params.add("usage", usage); // metrics belong inside the usage parameter

		AuthorizeResponse response = null;
		// the 'preferred way' of calling the backend: authrep
		try {
			response = serviceApi.authrep(serviceToken, serviceId, params);
			System.out.println("AuthRep on App Id Success: " + response.success());
			if (response.success() == true) {
				// your api access got authorized and the traffic added to
				// 3scale backend
				System.out.println("Plan: " + response.getPlan());
			} else {
				// your api access did not authorized, check why
				System.out.println("Error: " + response.getErrorCode());
				System.out.println("Reason: " + response.getReason());
				//TODO throw a security exception to interrupt the flow.
			}
		} catch (ServerError serverError) {
			serverError.printStackTrace();
		}
	}
}
