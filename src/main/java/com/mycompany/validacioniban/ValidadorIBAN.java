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
