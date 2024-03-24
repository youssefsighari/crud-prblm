package net.javaguides.springboot.exception;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;


 
@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class ResourceNotFoundException extends RuntimeException {
	 
	
	private String ressourceName;
	private String fieldName;
	private String fieldValue;

	public ResourceNotFoundException(String ressourceName,String fieldName,String fieldValue) {
		super(String.format("%s not found with %s : '%s'",ressourceName,fieldName,fieldValue));
		this.ressourceName=ressourceName;
		this.fieldName=fieldName;
		this.fieldValue=fieldValue;
	}
	
	public String getRessourceName() {
		return ressourceName;
	}
	
	public String fieldName() {
		return fieldName;
	}
	
	public String fieldValue() {
		return fieldValue;
	}
	
	
	

}










