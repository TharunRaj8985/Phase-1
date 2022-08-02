package com.simplilearn.CustomException;

public class AgenotValidException extends Exception{

	 private String msg;

	public AgenotValidException(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return "AgenotValidException[message=" + msg + "]";
	}
	
    
}
