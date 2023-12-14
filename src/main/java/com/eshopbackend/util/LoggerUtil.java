package com.eshopbackend.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {

	public static Logger getLogger() {
        // This assumes that the logger is always requested from a class directly (not from a subclass)
        return LoggerFactory.getLogger(getCallingClass());
    }

	
	 private static Class<?> getCallingClass() {
	        // This retrieves the calling class using the stack trace
	        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
	        String callingClassName = stackTrace[3].getClassName();
	        try {
	            return Class.forName(callingClassName);
	        } catch (ClassNotFoundException e) {
	            throw new RuntimeException("Error resolving calling class for logger", e);
	        }
	    }
}
