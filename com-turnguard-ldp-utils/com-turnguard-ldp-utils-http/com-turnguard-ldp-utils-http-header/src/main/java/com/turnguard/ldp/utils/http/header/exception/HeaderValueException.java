package com.turnguard.ldp.utils.http.header.exception;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class HeaderValueException extends Exception {

    public HeaderValueException() {
    }

    public HeaderValueException(String message) {
        super(message);
    }

    public HeaderValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public HeaderValueException(Throwable cause) {
        super(cause);
    }

}
