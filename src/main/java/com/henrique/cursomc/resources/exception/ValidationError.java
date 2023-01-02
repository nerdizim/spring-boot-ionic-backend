package com.henrique.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
	static final long serialVersionUID = 1L;
	
	public List<FieldMessage> erros = new ArrayList<>();

	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
		// TODO Auto-generated constructor stub
	}

	public List<FieldMessage> getErrors() {
		return erros;
	}

	public void addError(String fieldName, String message) {
		erros.add(new FieldMessage(fieldName, message));
		
	}

}
