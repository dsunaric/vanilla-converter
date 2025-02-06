package com.example.vanillatransformer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BPMNParseException extends RuntimeException {
    public BPMNParseException() {
        super();
    }
    public BPMNParseException(String message, Throwable cause) {
        super(message, cause);
    }
    public BPMNParseException(String message) {
        super(message);
    }
    public BPMNParseException(Throwable cause) {
        super(cause);
    }
}
