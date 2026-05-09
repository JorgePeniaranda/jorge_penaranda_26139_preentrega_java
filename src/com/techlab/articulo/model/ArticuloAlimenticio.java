package com.techlab.articulo.model;

/**
 * CONSIGNA DE ESTA CLASE
 * ------------------------------------------------------------
 * Esta clase debe heredar de Articulo.
 *
 * Representa un artículo alimenticio.
 *
 * ATRIBUTO ESPECÍFICO
 * ------------------------------------------------------------
 * - diasParaVencimiento : int
 *
 * ESTA CLASE DEBE
 * ------------------------------------------------------------
 * - tener constructor
 * - tener getters y setters
 * - sobrescribir getTipoArticulo()
 * - sobrescribir calcularPrecioFinal()
 *
 * IDEA DIDÁCTICA PARA calcularPrecioFinal()
 * ------------------------------------------------------------
 * Podés definir una regla propia, por ejemplo:
 * - si faltan pocos días para vencer, aplicar descuento
 * - si no, mantener el precio
 */
public class ArticuloAlimenticio extends Articulo {

    private int diasParaVencimiento;
    private static final int PORCENTAJE_DESCUENTO_VENCIMIENTO = 20;
    private static final int DIAS_UMBRAL_DESCUENTO_VENCIMIENTO = 20;

    // Crear constructor.
    public ArticuloAlimenticio(String codigo, String nombre, double precio, Categoria categoria,
            int diasParaVencimiento) {
        super(codigo, nombre, precio, categoria);

        this.diasParaVencimiento = diasParaVencimiento;
    }

    // Crear getters y setters.
    public int getDiasParaVencimiento() {
        return diasParaVencimiento;
    }

    public void setDiasParaVencimiento(int diasParaVencimiento) {
        this.diasParaVencimiento = diasParaVencimiento;
    }

    @Override
    public String getTipoArticulo() {
        return "Alimenticio";
    }

    @Override
    public double calcularPrecioFinal() {
        // Implementar lógica propia del artículo alimenticio.
        if (diasParaVencimiento > DIAS_UMBRAL_DESCUENTO_VENCIMIENTO) {
            return this.getPrecio();
        }

        return this.getPrecio() * (100 - PORCENTAJE_DESCUENTO_VENCIMIENTO) / 100;
    }
}
