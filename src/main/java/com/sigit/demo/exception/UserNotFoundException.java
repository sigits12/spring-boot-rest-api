package com.sigit.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Date 08/09/20
 *
 * @author sigit
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -2295959606032734410L;

    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String message) {
        super("Pencarian data " + message + " tidak ditemukan");
    }
}
