package com.devdanielc.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();
	
	
	
	public List<FieldMessage> getErrors() {
		return errors;
	}



	public void addError(String fieldName, String message) {
		this.errors.add(new FieldMessage(fieldName,message));
	}



	public ValidationError(Integer status, String mensagem, Long timeStamp) {
		super(status, mensagem, timeStamp);
	}


}
