package org.apache.camel.example.cxf.proxy;

import threescale.v3.api.AuthorizeResponse;
import threescale.v3.api.ParameterMap;
import threescale.v3.api.ServerError;
import threescale.v3.api.ServiceApi;
import threescale.v3.api.impl.ServiceApiDriver;

public class APICastBean {

	ServiceApi serviceApi = ServiceApiDriver.createApi();
	private String appID;
	private String appKey;
	private String serviceToken;
	private String serviceID;
	private String error;
	
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
		params.add("app_id",appID); // Add app_id of your application
												// for authorization
		params.add("app_key", appKey); // Add app_key of your
												// application for authorization
	
		ParameterMap usage = new ParameterMap(); // Add a metric to the call
		usage.add("hits", "1");
		params.add("usage", usage); // metrics belong inside the usage parameter

		AuthorizeResponse response = null;
		// the 'preferred way' of calling the backend: authrep
		try {
			response = serviceApi.authrep(serviceToken, serviceID, params);
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

	public ServiceApi getServiceApi() {
		return serviceApi;
	}

	public void setServiceApi(ServiceApi serviceApi) {
		this.serviceApi = serviceApi;
	}

	public String getAppID() {
		return appID;
	}

	public void setAppID(String appID) {
		this.appID = appID;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getServiceToken() {
		return serviceToken;
	}

	public void setServiceToken(String serviceToken) {
		this.serviceToken = serviceToken;
	}

	public String getServiceID() {
		return serviceID;
	}

	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
