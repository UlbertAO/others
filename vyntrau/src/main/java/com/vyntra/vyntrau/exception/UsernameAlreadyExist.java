package com.vyntra.vyntrau.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsernameAlreadyExist extends RuntimeException {

	public UsernameAlreadyExist(String exception) {
		super(exception);
		}

}
