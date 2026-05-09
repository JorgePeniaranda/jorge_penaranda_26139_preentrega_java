package com.techlab.articulo.model;

import com.techlab.articulo.interfaces.Identificable;

/**
 * CONSIGNA DE ESTA CLASE
 * ------------------------------------------------------------
 * Esta clase representa una categoría del sistema.
 *
 * Se utilizará como atributo dentro de Articulo.
 *
 * ATRIBUTOS OBLIGATORIOS
 * ------------------------------------------------------------
 * - codigo : int
 * - nombre : String
 * - descripcion : String
 *
 * ESTA CLASE DEBE
 * ------------------------------------------------------------
 * - implementar Identificable
 * - tener constructor
 * - tener getters y setters
 * - tener toString()
 *
 * IMPORTANTE
 * ------------------------------------------------------------
 * Luego esta clase tendrá su propio CRUD desde MenuCategorias.
 */
public class Categoria implements Identificable {

    private String codigo;
    private String nombre;
    private String descripcion;

    // Crear constructor.
    public Categoria(String codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Crear getters y setters restantes.
    @Override
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        // Mostrar todos los datos comunes del artículo.
        // Sugerencia:
        // incluir también tipo y precio final.
        return """
                Categoria{
                  codigo='%s'
                  nombre='%s'
                  descripcion=%s
                  categoria=%s
                  tipo=%s
                }""".formatted(
                codigo,
                nombre,
                descripcion);
    }
}
