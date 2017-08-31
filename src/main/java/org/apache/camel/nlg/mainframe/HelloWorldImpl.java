package org.apache.camel.nlg.mainframe;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface = "org.apache.camel.nlg.mainframe.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	Map<Integer, User> users = new LinkedHashMap<Integer, User>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.nlg.mainframe.HelloWorld#sayHi(java.lang.String)
	 */
	@Override
	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.camel.nlg.mainframe.HelloWorld#sayHiToUser(org.apache.camel.
	 * nlg.mainframe.User)
	 */
	@Override
	public String sayHiToUser(User user) {
		System.out.println("sayHiToUser called");
		users.put(users.size() + 1, user);
		return "Hello " + user.getName();
	}

	public Map<Integer, User> getUsers() {
		System.out.println("getUsers called");
		return users;
	}

}
