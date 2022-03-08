package com.company;

public class InvalidIDNumberException extends Exception { //must add the extends Exception - this is a pre-made Java Class
    private String message;

    public String getMessage() {
        return message;
    }
    public InvalidIDNumberException(String message) {
        super(message);
        //super(idNumber);
        this.message = message;
    }
}
