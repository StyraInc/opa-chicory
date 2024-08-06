package com.github.andreaTP.opa.chicory;

public class OpaAbortException extends RuntimeException {

    OpaAbortException(Throwable t) {
        super(t);
    }

    OpaAbortException(String msg) {
        super(msg);
    }

    OpaAbortException(String msg, Throwable t) {
        super(msg, t);
    }
}
