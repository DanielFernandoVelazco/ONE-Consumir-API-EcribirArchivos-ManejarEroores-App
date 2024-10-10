package com.alura.screenmatch.excepcion;

public class ErrorConvesionDuracionException extends RuntimeException {
    private  String mensaje;

    public ErrorConvesionDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
