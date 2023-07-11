package fr.cindanojonathan.departementservice.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(value = BAD_REQUEST)
public class DeptCodeAlreadyExistsException extends RuntimeException {

    private String message;

    public DeptCodeAlreadyExistsException(String message) {
        super(message);
    }
}
