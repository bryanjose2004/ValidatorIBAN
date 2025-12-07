package com.mycompany.validacioniban;

import java.math.BigInteger;

/**
 * Clase responsable de la lógica de validación de códigos IBAN.
 * Utiliza el estándar internacional ISO 13616 (Algoritmo Módulo 97-10).
 * * @author GeminiAI
 * @version 1.0
 */
public class ValidadorIBAN {

    /**
     * Valida si un IBAN es correcto verificando su formato y sus dígitos de control.
     * Soporta IBANs de España (ES) y otros países internacionales.
     * * @param iban El código IBAN introducido por el usuario (puede contener espacios).
     * @param iban
     * @return true si el IBAN es válido, false en caso contrario.
     */
    public boolean esIbanValido(String iban) {
    
        String ibanLimpio = iban.replaceAll("\\s+", "").toUpperCase();
        
 if (ibanLimpio.isEmpty() || ibanLimpio.length() < 15 || ibanLimpio.length() > 34) {
            return false;
        }

    
        if (ibanLimpio.startsWith("ES") && ibanLimpio.length() != 24) {
            return false;
        }
 String codigoPaisYControl = ibanLimpio.substring(0, 4);
        String cuenta = ibanLimpio.substring(4);
        String ibanReordenado = cuenta + codigoPaisYControl;

     
        StringBuilder ibanNumerico = new StringBuilder();
        for (int i = 0; i < ibanReordenado.length(); i++) {
            char caracter = ibanReordenado.charAt(i);
            
            if (Character.isLetter(caracter)) {
                ibanNumerico.append(Character.getNumericValue(caracter));
            } else {
                ibanNumerico.append(caracter);
            }
        }


        BigInteger numeroGrande = new BigInteger(ibanNumerico.toString());
        BigInteger divisor = new BigInteger("97");
        

        return numeroGrande.remainder(divisor).intValue() == 1;
    }
}