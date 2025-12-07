package com.mycompany.validacioniban;

 // Asegúrate de que coincida con tu paquete en NetBeans

import com.mycompany.validacioniban.ValidadorIBAN;
import java.util.Scanner;

/**
 * Clase principal que gestiona la interacción con el usuario.
 * Permite introducir IBANs repetidamente y muestra los resultados.
 * * @author GeminiAI
 * @version 1.0
 */
public class Main {

    /**
     * Método principal de ejecución.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidadorIBAN validador = new ValidadorIBAN();
        String opcion;
