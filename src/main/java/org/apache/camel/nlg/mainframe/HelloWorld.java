package org.apache.camel.nlg.mainframe;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

	String sayHi(String text);

	String sayHiToUser(User user);

}