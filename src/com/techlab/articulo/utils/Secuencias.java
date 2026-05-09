package com.techlab.articulo.utils;

/**
 * CONSIGNA DE ESTA CLASE
 * ------------------------------------------------------------
 * Esta clase debe encargarse de generar códigos automáticos.
 *
 * Debe manejar por separado:
 * - código de artículos
 * - código de categorías
 *
 * RECOMENDACIÓN
 * ------------------------------------------------------------
 * Hacerla utilitaria:
 * - clase final
 * - constructor privado
 * - atributos static
 * - métodos static
 *
 * MÉTODOS ESPERADOS
 * ------------------------------------------------------------
 * - generarCodigoArticulo()
 * - generarCodigoCategoria()
 *
 * OBJETIVO
 * ------------------------------------------------------------
 * Centralizar la lógica de generación de IDs en un solo lugar.
 */
public final class Secuencias {

    // Crear atributos static para llevar la secuencia.
    private static int proximoCodigoArticulo = 1;
    private static int proximoCodigoCategoria = 1;

    private Secuencias() {
    }

    // Implementar generarCodigoArticulo()
    public static String generarCodigoArticulo() {
        return "ART-" + proximoCodigoArticulo++;
    }

    // Implementar generarCodigoCategoria()
    public static String generarCodigoCategoria() {
        return "CAT-" + proximoCodigoCategoria++;
    }
}
