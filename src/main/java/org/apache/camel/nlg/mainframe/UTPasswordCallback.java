package org.apache.camel.nlg.mainframe;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

/**
 * Callback handler to handle passwords
 */
public class UTPasswordCallback implements CallbackHandler {

	private Map<String, String> passwords = new HashMap<String, String>();

	
	/**
	 * Here, we attempt to get the password from the private alias/passwords
	 * map.
	 */
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		
		String user = "";

		for (Callback callback : callbacks) {
			/**
					
			//TODO implement the OAuth token manipulation 
			String pass = passwords.get(getIdentifier(callback));
			if (pass != null) {
				setPassword(callback, pass);
				return;
			}
			**/
			setPassword(callback,"passw0rd");
			return;
			// Password not found
			
		}
		throw new IOException("Password does not exist for the user : " + user);
	}

	private void setPassword(Callback callback, String pass) {
		try {
			callback.getClass().getMethod("setPassword", String.class).invoke(callback, pass);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private String getPassword(Callback callback) {
		try {
			return (String) callback.getClass().getMethod("getPassword").invoke(callback);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private String getIdentifier(Callback cb) {
		try {
			return (String) cb.getClass().getMethod("getIdentifier").invoke(cb);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Add an alias/password pair to the callback mechanism.
	 */
	public void setAliasPassword(String alias, String password) {
		passwords.put(alias, password);
	}

	private String getPasswordType(Callback pc) {
		try {
			Method getType = null;
			try {
				getType = pc.getClass().getMethod("getPasswordType");
			} catch (NoSuchMethodException ex) {
				// keep looking
			} catch (SecurityException ex) {
				// keep looking
			}
			if (getType == null) {
				getType = pc.getClass().getMethod("getType");
			}
			String result = (String) getType.invoke(pc);
			return result;

		} catch (Exception ex) {
			return null;
		}
	}
}
