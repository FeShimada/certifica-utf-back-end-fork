package com.OficinaDeSoftware.EmissorCertificadosBackend.service.exception;

public class InternalServerError extends RuntimeException {
    public InternalServerError( String message ) {
        super(message);
    }
}
