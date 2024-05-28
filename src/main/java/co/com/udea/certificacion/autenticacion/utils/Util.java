package co.com.udea.certificacion.autenticacion.utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Util {

    public static String normalize(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        normalized = pattern.matcher(normalized).replaceAll("");

        // Eliminar caracteres especiales como ¡ y !
        normalized = normalized.replaceAll("[¡!]", "");

        return normalized;
    }



    private Util(){}
}