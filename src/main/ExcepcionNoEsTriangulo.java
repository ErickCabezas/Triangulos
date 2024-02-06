package main;

import java.time.LocalDate;

public class ExcepcionNoEsTriangulo extends Exception{

        public ExcepcionNoEsTriangulo(String message) {
            super(message);
            Log.registrarExcepciones(LocalDate.now()+" Excepción --> "+message);
        }

}
